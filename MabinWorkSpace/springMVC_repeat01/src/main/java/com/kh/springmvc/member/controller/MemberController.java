package com.kh.springmvc.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kh.springmvc.member.domain.Member;
import com.kh.springmvc.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService mService;

	/*
	 * 회원가입 화면으로 이동
	 * @param
	 * @return join.jsp
	 */
	@RequestMapping(value = "/member/joinView.kh", method = RequestMethod.GET)
	public String joinView() {
		return "member/join";
	}

	/*
	 * 가입하기 로직
	 * @param mv,member
	 * @return mv
	 */
	@RequestMapping(value = "/member/join.kh", method = RequestMethod.POST)
	public ModelAndView memberJoin(ModelAndView mv
			, @ModelAttribute Member member) {

		int result = mService.registMember(member);
		if (result > 0) {
			mv.setViewName("/home");
		} else {
			mv.addObject("msg", "회원 가입에 실패하였습니다.").setViewName("common/errorPage");
		}
		return mv;
	}
	/*
	 * 로그인 버튼 로직
	 * @param mv,member,HttpSession
	 * @return mv
	 */
	@RequestMapping(value="/member/login.kh" , method=RequestMethod.POST)
	public ModelAndView memberLogin(ModelAndView mv,
			@ModelAttribute Member member,
			HttpSession session) {
		Member mOne = mService.memberLogin(member);
		if(mOne != null) {
			session.setAttribute("loginUser",mOne);
			mv.setViewName("/home");
		}else {
			mv.addObject("msg", "로그인에 실패하였습니다").setViewName("common/errorPage");
		}
		return mv;
	}
	
	/*
	 * 로그아웃 클릭 로직
	 * @param HttpSession
	 * @return url
	 */
	@RequestMapping(value="/member/logout.kh",method=RequestMethod.GET)
	public String memberLogout(HttpSession session) {
		if(session.getAttribute("loginUser") !=null) {
			session.invalidate();
		}
		return "/home";
	}

}
