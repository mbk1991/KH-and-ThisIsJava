package com.kh.springmvc.board.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
	public ModelAndView registBoard(ModelAndView mv,
			@ModelAttribute Board board,
			@RequestParam(value="uploadFile", required=false) MultipartFile uploadFile,
			HttpServletRequest request
			) {

		try {
			String boardFilename = uploadFile.getOriginalFilename(); //파일이름 설정
			if(!uploadFile.getOriginalFilename().equals("")) {
				String root = request.getSession().getServletContext().getRealPath("resources");
				String savePath = root + "\\buploadFiles";

				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				String boardFileRename = sdf.format(new Date(System.currentTimeMillis()))
						+"."+boardFilename.substring(boardFilename.lastIndexOf(".")+1); // 확장자 추가
				
				File file = new File(savePath);
				if(!file.exists()) { // 폴더가 없을 때 폴더를 만드는 코드.
					file.mkdir();
				}
				uploadFile.transferTo(new File(savePath+"\\"+boardFileRename)); //파일을 buploadFile 경로에 저장하는 메소드.
				String boardFilepath = savePath;   //파일 경로 설정 (절대(savePath/ 상대)
				
				
				board.setboardFileName(boardFilename);
				board.setBoardFileRename(boardFileRename);
				board.setBoardFilepath(boardFilepath);
			}
			int result = bService.registerBoard(board);
			mv.setViewName("redirect:/board/list.kh");
		} catch (Exception e) {
			mv.addObject("msg", e.getMessage()).setViewName("common/errorPage");
		}

		return mv;
	}

	@RequestMapping(value = "/board/list.kh", method = RequestMethod.GET)
	public ModelAndView boardListView(ModelAndView mv
			, @RequestParam(value = "page", required = false) Integer page) {
		int currentPage = (page != null) ? page : 1;
		int totalCount = bService.getTotalCount();
		int boardLimit = 10;
		int naviLimit = 5;
		int maxPage;
		int startNavi;
		int endNavi;
		maxPage = (int) ((double) totalCount / boardLimit + 0.9);
		startNavi = ((int) ((double) currentPage / naviLimit + 0.9) - 1) * naviLimit + 1;
		endNavi = startNavi + naviLimit - 1;
		if (maxPage < endNavi) {
			endNavi = maxPage;
		}
		List<Board> bList = bService.printAllBoard(currentPage, boardLimit);
		if (!bList.isEmpty()) {
			mv.addObject("startNavi", startNavi);
			mv.addObject("endNavi", endNavi);
			mv.addObject("maxPage",maxPage);
			mv.addObject("bList", bList);
		}
		mv.setViewName("board/listView");
		return mv;
	}
}
