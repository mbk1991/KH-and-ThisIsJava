package com.kh.springmvc.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
//			@RequestParam("memberId") 
//			String memberId, 
//			@RequestParam("memberPwd") 
//			String memberPwd,
//			@RequestParam("memberName") 
//			String memberName, 
//			@RequestParam("memberEmail") 
//			String memberEmail,
//			@RequestParam("memberPhone") 
//			String memberPhone, 
			@ModelAttribute Member member,
			@RequestParam("post") 
			String post,
			@RequestParam("address") 
			String memberAddress,
			Model model){
		
		try {
			member.setMemberAddr(post + "," + memberAddress);
			int result = mService.registerMember(member);
			if (result > 0) {
				return "redirect:/home.kh";
			} else {
				model.addAttribute("msg","회원가입실패");
				return "common/errorPage";
			}
			
		} catch (Exception e) {
				model.addAttribute("msg",e.getMessage());
				return "common/errorPage";
		}
	}
	
	@RequestMapping(value="/member/login.kh", method=RequestMethod.POST)
	public String memberLogin(
			@RequestParam("member-id")
			String memberId,
			@RequestParam("member-pwd")
			String memberPwd,
			HttpServletRequest request
			,Model model
			) {
		
		try {
			Member member = new Member(memberId,memberPwd);
			Member loginUser = mService.loginMember(member);
			if(loginUser != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", loginUser);
				return "redirect:/home.kh";
			} else {
				model.addAttribute("msg","회원정보없음");
				return "common/errorPage";
			}
			
		} catch (Exception e) {
			model.addAttribute("msg",e.getMessage());
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="/member/logout.kh", method=RequestMethod.GET)
	public String memberLogout(HttpServletRequest request,Model model){
			HttpSession session = request.getSession();
			if(session != null) {
				session.invalidate();
				return "redirect:/home.kh";
			}else {
				model.addAttribute("msg","로그아웃 실패");
				return "common/errorPage";
			}
	}
	
	@RequestMapping(value="/member/mypage.kh",method=RequestMethod.GET)
	public String showMyPage() {
		return "member/myPage";
	}
	
}
