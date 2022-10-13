package com.kh.junspring.board.controller;

import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kh.junspring.board.domain.Board;
import com.kh.junspring.board.domain.Reply;
import com.kh.junspring.board.service.BoardService;
import com.kh.junspring.member.domain.Member;

// @Component
@Controller
public class BoardController {
	@Autowired
	private BoardService bService;
	
	/**
	 * 게시글 등록화면
	 * @return mv
	 */
	// 게시글 등록화면
	@RequestMapping(value="/board/writeView.kh", method=RequestMethod.GET)
	public String showBoardWrite() {
		return "board/boardWriteForm";
	}
	// 게시글 등록
	/**
	 * 게시글 등록
	 * @param mv
	 * @param board
	 * @return mv
	 */
	@RequestMapping(value="/board/register.kh", method=RequestMethod.POST)
	public ModelAndView registBoard(
			ModelAndView mv
			, @ModelAttribute Board board
			, @RequestParam(value="uploadFile", required=false) MultipartFile uploadFile
			,HttpServletRequest request) {
		
		try {
			String boardFilename = uploadFile.getOriginalFilename();
			if(!boardFilename.equals("")) {
				String root = request.getSession().getServletContext().getRealPath("resources");
				String savePath = root + "\\buploadFiles";
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				String boardFileRename 
				= sdf.format(new Date(System.currentTimeMillis()))+"."
						+boardFilename.substring(boardFilename.lastIndexOf(".")+1);
				// 1.png, img.png
				File file = new File(savePath);
				if(!file.exists()) {
					file.mkdir();
				}
				uploadFile.transferTo(new File(savePath+"\\"+boardFileRename)); 
				// 파일을 buploadFiles 경로에 저장하는 메소드
				String boardFilepath = savePath+"\\"+boardFileRename;
				board.setBoardFilename(boardFilename);
				board.setBoardFileRename(boardFileRename);
				board.setBoardFilepath(boardFilepath);
				
			}
			int result = bService.registerBoard(board);
			mv.setViewName("redirect:/board/list.kh");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("msg", e.getMessage());
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	@RequestMapping(value="/board/list.kh", method=RequestMethod.GET)
	public ModelAndView boardListView(
			ModelAndView mv
			,@RequestParam(value="page", required=false) Integer page
			,HttpSession session) {
		int currentPage = (page != null) ? page : 1;
		int totalCount = bService.getTotalCount("","");
		int boardLimit = 10;
		int naviLimit = 5;
		int maxPage;
		int startNavi;
		int endNavi;
		// 23/5 = 4.8 + 0.9 = 5(.7)
		maxPage = (int)((double)totalCount/boardLimit + 0.9);
		startNavi = ((int)((double)currentPage/naviLimit+0.9)-1)*naviLimit+1;
		endNavi = startNavi + naviLimit - 1;
		
		if(currentPage < 1) {
			currentPage = 1;
		}
		if(currentPage > maxPage) {
			currentPage = maxPage;
		}
		if(maxPage < endNavi) {
			endNavi = maxPage;
		}
		if(startNavi < 1) {
			startNavi = 1;
		}
		session.setAttribute("currentPage", currentPage);
		
		//el을 
		List<Board> bList = bService.printAllBoard(currentPage, boardLimit);
		if(!bList.isEmpty()) {
			mv.addObject("urlVal","list");
			mv.addObject("currentPage",currentPage);
			mv.addObject("startNavi", startNavi);
			mv.addObject("endNavi", endNavi);
			mv.addObject("bList", bList);
			mv.addObject("maxPage",maxPage);
		}
		mv.setViewName("board/listView");
		return mv;
	}
	
	@RequestMapping(value="/board/detail.kh", method=RequestMethod.GET)
	public ModelAndView boardDetailView(ModelAndView mv,
			@RequestParam("boardNo") Integer boardNo,
			HttpSession session) {
		
		try {
			Board board = bService.printOneByNo(boardNo);
			//세션에 보드넘버를 저장. 삭제,수정 할 때 사용하기 위함.
			//세션을 초기화하는 것도 필요해보인다. 이름이 같으면 그냥 초기화가 되나?
			session.setAttribute("boardNo",board.getBoardNo());
			int result = bService.modifyBoardCount(boardNo);
			List<Reply> rList = bService.printAllReplyByNo(boardNo);
			if(!rList.isEmpty()) {
				mv.addObject("rList",rList);
			}else {
				mv.addObject("rList",null);
			}
			mv.addObject("board",board).setViewName("board/detailView");
		} catch (Exception e) {
			mv.addObject("msg",e.getMessage()).setViewName("common/errorPage");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/board/modifyView.kh",method=RequestMethod.GET)
	public ModelAndView boardModifyView(ModelAndView mv,
			@RequestParam("boardNo")Integer boardNo) {
		try {
			Board board = bService.printOneByNo(boardNo);
			mv.addObject("board",board).setViewName("board/modifyForm");
		
		} catch (Exception e) {
			mv.addObject("msg",e.toString()).setViewName("common/errorPage");
		}
		return mv;
	}
	
	@RequestMapping(value="/board/remove.kh",method=RequestMethod.GET)
	public ModelAndView removeBoard(ModelAndView mv,
			HttpSession session) {
		try {
			int boardNo = (int) session.getAttribute("boardNo");
			int result = bService.removeOneByNo(boardNo);
			if(result>0) {
				session.removeAttribute("boardNo");
			}
			int currentPage = (int) session.getAttribute("currentPage");
			mv.setViewName("redirect:/board/list.kh?page="+currentPage);
		} catch (Exception e) {
			mv.addObject("msg",e.toString()).setViewName("common/errorPage");
		}
		return mv;
	}
	
	@RequestMapping(value="/board/modify.kh",method=RequestMethod.POST)
	public ModelAndView boardModify(ModelAndView mv,
			@ModelAttribute Board board,
			HttpSession session,
			@RequestParam(value="reloadFile",required=false) MultipartFile reloadFile,
			HttpServletRequest request) {
		
		try {
			String boardFilename = reloadFile.getOriginalFilename();
			if(reloadFile != null && !boardFilename.equals("")) {
				//수정 1. 대체(replace)/ 2.삭제 후 등록 -> 삭제 후 등록으로 실습 진행.
				String root = request.getSession().getServletContext().getRealPath("resources");
				String savedPath = root + "\\buploadFiles";
				File file = new File(savedPath+"\\" + "파일이름");
				if(file.exists()) {
					file.delete();
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				String boardFileRename = sdf.format(new Date(System.currentTimeMillis()))+
						"."+boardFilename.substring(boardFilename.lastIndexOf(".")+1);
				reloadFile.transferTo(new File(savedPath + "\\" + boardFileRename));
				board.setBoardFilename(boardFilename);
				board.setBoardFileRename(boardFileRename);
				board.setBoardFilepath(savedPath + "\\" + boardFileRename);
			}
			
			
			int result= bService.modifyBoard(board);
			int currentPage = (int)session.getAttribute("currentPage");
			mv.setViewName("redirect:/board/list.kh?page="+currentPage);
		} catch (Exception e) {
			mv.addObject("msg",e.getMessage()).setViewName("common/errorPage");
		}
		return mv;
		
	}
	
	@RequestMapping(value="/board/search.kh",method=RequestMethod.GET)
	public ModelAndView boardSearchList(ModelAndView mv,
			@RequestParam("searchCondition")String searchCondition,
			@RequestParam("searchValue")String searchValue,
			@RequestParam(value="page",required=false)Integer page ) {
		try {
			///////////////페이징처리
			int currentPage = (page != null) ? page : 1;
			int totalCount = bService.getTotalCount(searchCondition,searchValue);
			int boardLimit = 10;
			int naviLimit = 5;
			int maxPage;
			int startNavi;
			int endNavi;
			// 23/5 = 4.8 + 0.9 = 5(.7)
			maxPage = (int)((double)totalCount/boardLimit + 0.9);
			startNavi = ((int)((double)currentPage/naviLimit+0.9)-1)*naviLimit+1;
			endNavi = startNavi + naviLimit - 1;
			
			if(currentPage < 1) {
				currentPage = 1;
			}
			if(currentPage > maxPage) {
				currentPage = maxPage;
			}
			if(maxPage < endNavi) {
				endNavi = maxPage;
			}
			if(startNavi < 1) {
				startNavi = 1;
			}
			
			///////////////페이징처리
			List<Board> bList = bService.printAllByValue(currentPage, boardLimit,searchCondition,searchValue);
			//BOARD_TBL <- SELECT* FROM BOARD_TBL WHERE B_STATUS = 'Y' AND BOARD_TITLE LIKE '%'||#{searchValue}||'%'
		    //			<- SELECT* FROM BOARD_TBL WHERE B_STATUS = 'Y' AND BOARD_TITLE LIKE '%'||#{searchValue}||'%'
		    //			<- SELECT* FROM BOARD_TBL WHERE B_STATUS = 'Y' AND BOARD_TITLE LIKE '%'||#{searchValue}||'%'
			 //	이렇게는 안되나?		<- SELECT* FROM BOARD_TBL WHERE B_STATUS = 'Y' AND #{searchCondition} LIKE '%'||#{searchValue}||'%'
			if(!bList.isEmpty()) {
				
				///jsp에 조건문/
			}else {
				mv.addObject("bList",null);
			}
			mv.addObject("urlVal","search");
			mv.addObject("searchCondition",searchCondition);
			mv.addObject("searchValue",searchValue);
			mv.addObject("currentPage",currentPage);
			mv.addObject("startNavi", startNavi);
			mv.addObject("endNavi", endNavi);
			mv.addObject("bList", bList);
			mv.addObject("maxPage",maxPage);
			mv.addObject("bList",bList).setViewName("board/listView");
			
		} catch (Exception e) {
			mv.addObject("msg",e.getMessage()).setViewName("common/errorPage");
		}
		return mv;
	}
	
	
	
	/**
	 * 댓글등록 ajax 버전
	 * @param reply
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/board/replyAdd.kh", method=RequestMethod.POST)
	public String boardReplyAdd(
			@ModelAttribute Reply reply) {
		reply.setReplyWriter("admin");
		int result = bService.registerReply(reply);
		if(result>0) {
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	/**
	 * ajax 댓글 삭제
	 * @param replyNo
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/board/replyDelete.kh",method=RequestMethod.GET)
	public String boardReplyDelete(@RequestParam("replyNo")Integer replyNo) {
		int result = bService.removeReply(replyNo);
		if(result > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	/**
	 * ajax댓글 수정
	 */
	@ResponseBody
	@RequestMapping(value="/board/replyModify.kh",method=RequestMethod.POST)
	public String boardReplyModify(
			@ModelAttribute Reply reply) {
		int result = bService.modifyReply(reply);
		if(result > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	
	
	/**
	 * 댓글 리스트 출력
	 * @param boardNum
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/board/replyList.kh",produces="application/json;charset=utf8", method=RequestMethod.GET)
	public String boardReplyList(@RequestParam("boardNo")Integer boardNum) {
		int boardNo = (boardNum == null) ? 1 : boardNum;
		List<Reply>rList = bService.printAllReplyByNo(boardNo);
		if(!rList.isEmpty()) {
			
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			return gson.toJson(rList);
		}
		return null;
	}
	
	
	
	
	
	
	
	@RequestMapping(value="/board/addReply.kh",method=RequestMethod.POST)
	public ModelAndView addBoardReply(ModelAndView mv,
			@ModelAttribute Reply reply,
			HttpSession session) {
		//INSERT INTO REPLY_TBL VALUES(REPLY_NO,REF_BOARD_NO,REPLY_CONTENTS,REPLY_WRITER,R_CREATE_DATE,R_UPDATE_DATE,R_STATUS)
		Member member = (Member)session.getAttribute("loginUser");
		reply.setReplyWriter(member.getMemberId());
		int result = bService.registerReply(reply);
		if(result > 0) {
			mv.setViewName("redirect:/board/detail.kh?boardNo="+reply.getRefBoardNo());
		}
		return mv;
	}
	
	/**
	 * 
	 */
	@RequestMapping(value="/board/modifyReply.kh",method=RequestMethod.POST)
	public ModelAndView modifyReply(ModelAndView mv,
			@ModelAttribute Reply reply) {
		int result = bService.modifyReply(reply);
		if(result > 0) {
//			mv.setViewName("redirect:/board/detail.kh?boardNo=");
			mv.setViewName("redirect:/board/list.kh");
		}else {
			
		}
		
		return mv;
	}
	
	@RequestMapping(value="/board/removeReply.kh", method=RequestMethod.POST)
	public ModelAndView removeReply(ModelAndView mv,
			@RequestParam("replyNo") Integer replyNo) {
		System.out.println("확인");
		int result = bService.removeReply(replyNo);
		if(result > 0){
			mv.setViewName("redirect:/board/list.kh");
		}else {
			
		}
		return mv;
	}
	
	
	
	
	/////////////예외처리 어노테이션
	
	@ExceptionHandler({NullPointerException.class, SQLException.class})
	public String errorHandler(Exception e) {
		
		
			return "";
		}
	
	
	
	
	
	
}
