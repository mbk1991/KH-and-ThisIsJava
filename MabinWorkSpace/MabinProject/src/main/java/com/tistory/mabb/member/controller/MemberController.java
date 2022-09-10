package com.tistory.mabb.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping(value="/joinView", method=RequestMethod.GET)
	public String viewMemberJoin() {
		
		return "member/join";
	}
	
}
