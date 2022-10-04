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
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/member/register.kh", method = RequestMethod.POST)
	public ModelAndView memberJoin(
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
			@ModelAttribute Member member, @RequestParam("post") String post,
			@RequestParam("address") String memberAddress, ModelAndView mv) {

		try {
			member.setMemberAddr(post + "," + memberAddress);
			int result = mService.registerMember(member);
			if (result > 0) {
				mv.setViewName("redirect:/home.kh");
			} else {
				mv.addObject("msg", "회원가입실패");
				mv.setViewName("common/errorPage");
			}

		} catch (Exception e) {
			mv.addObject("msg", e.getMessage());
			mv.setViewName("common/errorPage");
		}
		return mv;
	}

	@RequestMapping(value = "/member/login.kh", method = RequestMethod.POST)
	public String memberLogin(@RequestParam("member-id") String memberId, @RequestParam("member-pwd") String memberPwd,
			HttpServletRequest request, Model model) {

		try {
			Member member = new Member(memberId, memberPwd);
			Member loginUser = mService.loginMember(member);
			if (loginUser != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", loginUser);
				return "redirect:/home.kh";
			} else {
				model.addAttribute("msg", "회원정보없음");
				return "common/errorPage";
			}

		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "common/errorPage";
		}
	}

	@RequestMapping(value = "/member/logout.kh", method = RequestMethod.GET)
	public String memberLogout(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
			return "redirect:/home.kh";
		} else {
			model.addAttribute("msg", "로그아웃 실패");
			return "common/errorPage";
		}
	}

	@RequestMapping(value = "/member/mypage.kh", method = RequestMethod.GET)
	public String showMyPage(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("loginUser");
		String memberId = member.getMemberId();
		Member mOne = mService.printOneById(memberId);
		String mAddr = mOne.getMemberAddr();
		String[] addrInfos = mAddr.split(",");
		model.addAttribute("addrInfos", addrInfos);

		try {
			if (mOne != null) {
				model.addAttribute("member", mOne);
				return "member/myPage";

			} else {
				model.addAttribute("msg", "조회를 실패하였습니다.");
				return "common/errorPage";
			}

		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "common/errorPage";
		}
	}

	@RequestMapping(value = "/member/modify.kh", method = RequestMethod.POST)
	public ModelAndView modifyMember(@ModelAttribute Member member, @RequestParam("post") String post,
			@RequestParam("address") String address, ModelAndView mv) {

		try {
			member.setMemberAddr(post + "," + address);
			int result = mService.modyfyMember(member);
			if (result > 0) {
				mv.setViewName("redirect:/home.kh");
			} else {
				mv.addObject("msg","정보 수정에 실패하였습니다.").setViewName("common/errorPage");
			}
		} catch (Exception e) {
			mv.addObject("msg",e.getMessage()).setViewName("common/errorPage");
		}
		return mv;
	}

	@RequestMapping(value="/member/remove.kh",method=RequestMethod.GET)
	public ModelAndView removeMember(HttpSession session,ModelAndView mv) {
		System.out.println("동작확인");
		try {
			Member member = (Member) session.getAttribute("loginUser");
			String memberId = member.getMemberId();
			System.out.println("동작확인");
			int result = mService.removeMember(memberId);
			System.out.println("동작확인");
			if (result > 0) {
				mv.setViewName("redirect:/member/logout.kh");
			} else {
				mv.addObject("msg", "탈퇴에 실패하였습니다.").setViewName("common/errorPage");
			}
		} catch (Exception e) {
			mv.addObject("msg",e.toString()).setViewName("common/errorPage");
		}
		
		return mv;
	}
}
