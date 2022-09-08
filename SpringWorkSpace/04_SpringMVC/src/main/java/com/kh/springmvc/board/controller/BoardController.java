package com.kh.springmvc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		@param 
*/
	@RequestMapping(value="/board/writeView.kh",method=RequestMethod.GET)
	public String showboardWrite() {
		return "board/boardWriteForm";
	}
	
	@RequestMapping(value="/board/register.kh", method=RequestMethod.POST)
	public ModelAndView registBoard(ModelAndView mv,
			@ModelAttribute Board board) {

		try {
			int result = bService.registerBoard(board);
			mv.setViewName("redirect:/board/list.kh");
		} catch (Exception e) {
			mv.addObject("msg",e.getMessage()).setViewName("common/errorPage");
		}
		
		return mv;
	}
	@RequestMapping(value="/board/list.kh",method=RequestMethod.GET)
	public ModelAndView boardListView(ModelAndView mv) {
		List<Board> bList = bService.printAllBoard();
		if(!bList.isEmpty()) {
			mv.addObject("bList",bList);
		}
		mv.setViewName("board/listView");
		return mv;
	}
}
