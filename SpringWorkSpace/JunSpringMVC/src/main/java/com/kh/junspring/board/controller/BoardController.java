package com.kh.junspring.board.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.junspring.board.domain.Board;
import com.kh.junspring.board.service.BoardService;

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
			,@RequestParam(value="page", required=false) Integer page) {
		int currentPage = (page != null) ? page : 1;
		int totalCount = bService.getTotalCount();
		int boardLimit = 10;
		int naviLimit = 5;
		int maxPage;
		int startNavi;
		int endNavi;
		// 23/5 = 4.8 + 0.9 = 5(.7)
		maxPage = (int)((double)totalCount/boardLimit + 0.9);
		startNavi = ((int)((double)currentPage/naviLimit+0.9)-1)*naviLimit+1;
		endNavi = startNavi + naviLimit - 1;
		if(maxPage < endNavi) {
			endNavi = maxPage;
		}
		List<Board> bList = bService.printAllBoard(currentPage, boardLimit);
		if(!bList.isEmpty()) {
			mv.addObject("startNavi", startNavi);
			mv.addObject("endNavi", endNavi);
			mv.addObject("bList", bList);
		}
		mv.setViewName("board/listView");
		return mv;
	}
	
	@RequestMapping(value="/board/modify.kh",method=RequestMethod.POST)
	public void boardModify(
			@ModelAttribute Board board) {
		int result = bService.modifyBoard(board);
		
	}
	
	
	
	
	
	
	
	
	
}
