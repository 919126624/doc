package com.fyrj.cas.controller;

import org.jasig.cas.client.util.AssertionHolder;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * ��������cas
 * @author ying.cai
 * @date 2017��7��17������1:41:40
 */
@Controller
public class HomeController {
	
	@RequestMapping("success")
	public String success(ModelMap map){
		//��ȡ��½�û���
		Assertion assertion = AssertionHolder.getAssertion();
		String loginId = assertion.getPrincipal().getName();
		map.put("loginId", loginId);
		return "success";
	}
}
