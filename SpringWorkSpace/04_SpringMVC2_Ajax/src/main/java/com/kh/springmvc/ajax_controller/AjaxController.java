package com.kh.springmvc.ajax_controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.springmvc.member.domain.Member;

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
	@RequestMapping(value="/ajax/ex2.kh", produces="text/plain;charset=utf-8", method=RequestMethod.GET)
	public String exerciseAjax2() {
		return "서버에서 왔습니다.";
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ex3.kh",produces="text/plain;charset=utf-8",method=RequestMethod.GET)
	public String exerciseAjax3(@RequestParam("num1")Integer num1,
			@RequestParam("num2")Integer num2) {
		int sum = num1+num2;
		
		return String.valueOf(sum);
	}
	
	@ResponseBody
	@RequestMapping(value="/ajax/ex4.kh",produces="application/json;charset=utf-8",method=RequestMethod.GET)
	public String exerciseAjax4(@RequestParam("memberId") String memberId) {
		JSONObject jsonObj = new JSONObject();
		
		//1.비어있는 json객체 생성. gson 으로 만드는 것과 무슨차이지?
		//디비에서 가져온 것처럼 데이터를 셋팅하여 실습.
		List<Member> mList = new ArrayList<>();
		mList.add(new Member("khuser01","pass01"));
		mList.add(new Member("khuser02","pass02"));
		mList.add(new Member("khuser03","pass03"));
		mList.add(new Member("khuser04","pass04"));
		mList.add(new Member("khuser05","pass05"));
		
		Member member=null;
		for(int i=0; i<mList.size(); i++) {
			if(mList.get(i).getMemberId().equals(memberId)){
				member = mList.get(i);
				break;
			}
		}
		if(member != null) {
			jsonObj.put("memberPwd",member.getMemberPwd());
		}else {
			//아이디가 존재하지 않음.
			jsonObj.put("memberPwd","아이디가 존재하지 않습니다.");
		}
		
		return jsonObj.toString();
	}
}
