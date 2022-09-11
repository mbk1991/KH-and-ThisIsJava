package com.kh.springmvc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.springmvc.board.domain.Board;
import com.kh.springmvc.board.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService bService;
	/*
	 * 자유게시판 목록 이동
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
}
