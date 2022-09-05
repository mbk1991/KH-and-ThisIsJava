package com.kh.springmvc.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springmvc.member.domain.Member;
import com.kh.springmvc.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService mService;

	@RequestMapping(value = "/member/joinView.kh", method = RequestMethod.GET)
	public String memberJoinView() {
		return "member/join";
		// jsp의 이름이 되어야 함.
		// /WEB-INF/views/member/join.jsp
	}
	
	@RequestMapping(value="/member/register.kh" , method=RequestMethod.POST)
	public String memberJoin(
			@RequestParam("memberId") String memberId, 
			@RequestParam("memberPwd") String memberPwd,
			@RequestParam("memberName") String memberName, 
			@RequestParam("memberEmail") String memberEmail,
			@RequestParam("memberPhone") String memberPhone, 
			@RequestParam("post") String post,
			@RequestParam("address") String memberAddress)
	{
		Member member = new Member(memberId, memberPwd, memberName, memberEmail, memberPhone);
		member.setMemberAddr(post + "," + memberAddress);
		int result = mService.registerMember(member);
		if (result > 0) {
			return "redirect:/home.kh";
		} else {
			return "";
		}
	}

}
