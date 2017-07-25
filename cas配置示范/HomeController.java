package com.fyrj.cas.controller;

import org.jasig.cas.client.util.AssertionHolder;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 用来测试cas
 * @author ying.cai
 * @date 2017年7月17日下午1:41:40
 */
@Controller
public class HomeController {
	
	@RequestMapping("success")
	public String success(ModelMap map){
		//获取登陆用户名
		Assertion assertion = AssertionHolder.getAssertion();
		String loginId = assertion.getPrincipal().getName();
		map.put("loginId", loginId);
		return "success";
	}
}
