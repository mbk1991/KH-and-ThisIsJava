package com.kh.springmvc.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	/*
	 * 정보수정view 이동
	 * @param mv,session
	 * @return mv
	 */
	@RequestMapping(value="/member/modifyView.kh",method=RequestMethod.GET)
	public ModelAndView memberModifyView(ModelAndView mv,
			HttpSession session) {
		Member loginMember = (Member)session.getAttribute("loginUser");
		if(loginMember != null) {
			mv.addObject("loginMember",loginMember).setViewName("/member/modify");
		}else {
			mv.setViewName("/home");
		}
		return mv;
	}
	
	/*
	 * 정보수정 버튼 로직
	 * @param mv,member
	 * @return mv
	 */
	@PostMapping("/member/modify.kh")
	public ModelAndView memberModify(ModelAndView mv,
			@ModelAttribute Member member) {
		int result = mService.modifyMember(member);
		if(result > 0) {
			
			mv.setViewName("/home");
		}else {
			mv.addObject("msg", "회원 수정에 실패하였습니다").setViewName("/home");
		}
		return mv;
	}
	
	@RequestMapping(value="/member/remove.kh",method=RequestMethod.GET)
	public ModelAndView memberRemove(ModelAndView mv,
			HttpSession session) {
		Member loginMember = (Member)session.getAttribute("loginUser");
		String memberId = loginMember.getMemberId();
		int result = mService.removeMember(memberId);
		if(result > 0) {
			session.invalidate();
			mv.setViewName("/home");
		}else {
			mv.addObject("msg","회원 탈퇴에 실패하였습니다.").setViewName("/member/errorPage");
		}
		return mv;
	}

}
