package com.xinyu.testNacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.nacos.api.config.annotation.NacosValue;

@Controller
public class UserController {

	@NacosValue(value = "${user.name:null}", autoRefreshed = true)
	private String userName;

	@RequestMapping(value = "/getUser")
	@ResponseBody
	public String getUser() {
		return userName;
	}
}
