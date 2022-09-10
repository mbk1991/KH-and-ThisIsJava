package com.kh.springmvc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView freeBoardView(ModelAndView mv) {
		List<Board> bList = bService.printBoardList(); 
		if(!bList.isEmpty()) {
			mv.addObject("bList",bList).setViewName("board/freeboard");
		}else {
			mv.addObject("msg","자유게시판 조회에 실패하였습니다.").setViewName("/common/errorPage");
		}
		return mv;
	}
}
