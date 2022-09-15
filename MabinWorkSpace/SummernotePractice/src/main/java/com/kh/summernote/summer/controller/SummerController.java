package com.kh.summernote.summer.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.kh.summernote.summer.domain.TestTable;
import com.kh.summernote.summer.service.SummerService;

@Controller
public class SummerController {
	@Autowired
	SummerService sService;

	@RequestMapping(value = "summer/registerView.kh", method = RequestMethod.GET)
	public String registerBoardView() {

		return "/summernote/summernoteInsert";
	}

	@RequestMapping(value = "/summer/register.kh", method = RequestMethod.POST)
	public ModelAndView registerBoard(ModelAndView mv, @ModelAttribute TestTable table) {
		int result = sService.registerBoard(table);

		if (result > 0) {
			System.out.println("성공");
			mv.setViewName("/home");
		} else {
			System.out.println("실패");
			mv.setViewName("/home");
		}
		return mv;
	}
}
