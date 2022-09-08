package com.kh.springmvc.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	 * @param
	 */
	@RequestMapping(value = "/board/writeView.kh", method = RequestMethod.GET)
	public String showboardWrite() {
		return "board/boardWriteForm";
	}

	@RequestMapping(value = "/board/register.kh", method = RequestMethod.POST)
	public ModelAndView registBoard(ModelAndView mv, @ModelAttribute Board board) {

		try {
			int result = bService.registerBoard(board);
			mv.setViewName("redirect:/board/list.kh");
		} catch (Exception e) {
			mv.addObject("msg", e.getMessage()).setViewName("common/errorPage");
		}

		return mv;
	}

	@RequestMapping(value = "/board/list.kh", method = RequestMethod.GET)
	public ModelAndView boardListView(ModelAndView mv) {
		List<Board> bList = bService.printAllBoard();
		mv.addObject("bList", bList);
		mv.setViewName("board/listView");
		return mv;
	}

	@RequestMapping(value ="/board/list.kh",method=RequestMethod.GET)
	public ModelAndView boardToTalCount(
			ModelAndView mv, 
			@RequestParam(value="page", required=false) Integer page) { // required=false로 null값을 허용한다.
		int currentPage = (page != null) ? page : 1; //삼항연산자, 널일때는 1 아닐때는 page값
		int totalCount = bService.getTotalCount();
		int boardLimit = 10;
		int naviLimit = 5;
		int maxPage;
		int startNavi;
		int endNavi;
		maxPage = (int)((double)totalCount/boardLimit + 0.9);
		startNavi = ((int)((double)currentPage/naviLimit + 0.9)-1)*naviLimit+1;
		endNavi = startNavi + naviLimit -1;
		if(maxPage < endNavi) {
			endNavi = maxPage;
		}
		
		List<Board> bList = bService.printAllBoard();
		if (!bList.isEmpty()) {
			mv.addObject("bList", bList);
		}
		mv.setViewName("board/listView");

		return mv;
	}
	
}
