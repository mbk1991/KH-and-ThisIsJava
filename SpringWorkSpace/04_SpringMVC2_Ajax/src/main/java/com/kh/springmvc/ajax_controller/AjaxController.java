package com.kh.springmvc.ajax_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping(value="/ajax/exervise.kh",method=RequestMethod.GET)
	public String showAjaxExercise() {
		return "ajax/ajaxExercise";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ex1.kh",method=RequestMethod.GET)
	public String exerciseAjax1(@RequestParam("msg")String msg) {
		System.out.println("전송받은 데이터: "+msg);
		return "{'msg':'success'}";
		
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ex2.kh",method=RequestMethod.GET)
	public String exerciseAjax2() {
		
		return "서버에서 왔습니다.";
	}
}
