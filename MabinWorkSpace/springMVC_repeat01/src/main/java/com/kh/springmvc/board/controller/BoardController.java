package com.kh.springmvc.board.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.service.BoardService;
import com.kh.springmvc.member.domain.Member;

@Controller
public class BoardController {
	@Autowired
	private BoardService bService;
	/*
	 * 자유게시판 목록 이동
	 * @param mv,page
	 * @return mv
	 */
	@RequestMapping(value="/board/freeboardList.kh",method=RequestMethod.GET)
	public ModelAndView freeBoardView(ModelAndView mv,
			@RequestParam(value="page", required=false)Integer page) {
		int currentPage = 1;
		if(page != null) {
			currentPage = page;
		}
		int countAllPost = bService.countAllPost();
		int postPerPage = 10;
		int startPage = 1;
		int endPage;
		int naviSize = 5;
		int naviStart;
		int naviEnd;
		endPage = (int)((double)countAllPost / postPerPage+0.9);
		naviEnd = (((currentPage-1)/naviSize)+1)*naviSize;
		if(naviEnd > endPage) {
			naviEnd = endPage;
		}
		naviStart = (naviEnd-naviSize)+1;
//		RowBounds를 위한 offset, limit
		int limit = postPerPage;
		int offset = (currentPage-1) * limit;
		
		List<Board> bList = bService.printBoardList(limit, offset); 
		if(!bList.isEmpty()) {
			mv.addObject("startPage",startPage);
			mv.addObject("endPage",endPage);
			mv.addObject("naviSize",naviSize);
			mv.addObject("naviStart",naviStart);
			mv.addObject("naviEnd",naviEnd);
			mv.addObject("bList",bList).setViewName("board/freeboard");
		}else {
			mv.addObject("msg","자유게시판 조회에 실패하였습니다.").setViewName("/common/errorPage");
		}
		return mv;
	}
	
	/*
	 * 자유게시판 작성하기 버튼 클릭 시 게시글 작성화면 이동
	 * @param mv
	 * @return mv
	 */
	@RequestMapping(value="/board/registpostView.kh",method=RequestMethod.GET)
	public ModelAndView registPostView(ModelAndView mv) {
			mv.setViewName("/board/registPost");
		return mv;
	}
	
	/*
	 * 게시물 작성 후 저장하기 클릭
	 * @param mv , board, session, uploadFile, request
	 * @return mv
	 */
	@PostMapping("/board/registPost.kh")
	public ModelAndView registPost(ModelAndView mv,
			@ModelAttribute Board board,
			HttpSession session,
			@RequestParam(value="uploadFile",required=false) MultipartFile uploadFile,
			HttpServletRequest request) {
		try {
			String boardFileName = uploadFile.getOriginalFilename();
			if(!boardFileName.equals("")) {
				String root = request.getSession().getServletContext().getRealPath("resources");
				String savePath = root+"\\buploadFiles";
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				String boardFileRename = 
						sdf.format(new Date(System.currentTimeMillis()))
						+"."
						+boardFileName.substring(boardFileName.lastIndexOf(".")+1);
				File file = new File(savePath);
				if(!file.exists()) {
					file.mkdir();
					}
				String boardFilePath = savePath+"\\"+boardFileRename;
				uploadFile.transferTo(new File(boardFilePath));
				Member member = (Member)session.getAttribute("loginUser");
				board.setBoardWriter(member.getMemberId());
				board.setBoardFileName(boardFileName);
				board.setBoardFileReName(boardFileRename);
				board.setBoardFilePath(boardFilePath);
			} 
			
			int result = bService.registPost(board);
			if(result > 0) {
				mv.setViewName("/board/freeboard");
			}else {
				mv.addObject("msg","글 저장에 실패하였습니다.").setViewName("common/errorPage");
			}
		
		
		}catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return mv;
	}
	
	
	
	@PostMapping(value="/uploadSummernoteImageFile", produces = "application/json")
	@ResponseBody
	public JsonObject uploadSummernoteImageFile(@RequestParam("file") MultipartFile multipartFile) {
		
		JsonObject jsonObject = new JsonObject();
		
		String fileRoot = "C:\\summernote_image";	//저장될 외부 파일 경로
		String originalFileName = multipartFile.getOriginalFilename();	//오리지날 파일명
		String extension = originalFileName.substring(originalFileName.lastIndexOf("."));	//파일 확장자
				
		String savedFileName = UUID.randomUUID() + extension;	//저장될 파일 명
		
		File targetFile = new File(fileRoot + savedFileName);	
		
		try {
			InputStream fileStream = multipartFile.getInputStream();
			FileUtils.copyInputStreamToFile(fileStream, targetFile);	//파일 저장
			jsonObject.addProperty("url", "/summernoteImage/"+savedFileName);
			jsonObject.addProperty("responseCode", "success");
				
		} catch (IOException e) {
			FileUtils.deleteQuietly(targetFile);	//저장된 파일 삭제
			jsonObject.addProperty("responseCode", "error");
			e.printStackTrace();
		}
		
		return jsonObject;
	}
	
	
	
	
}
