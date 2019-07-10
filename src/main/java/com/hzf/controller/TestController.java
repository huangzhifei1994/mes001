package com.hzf.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;

import com.hzf.service.TestService;

//@Controller
@RequestMapping("/testController")
public class TestController {
	@Resource
	private TestService testService;

	@RequestMapping("/test")
	public String test() {
//		testService.testUser();
		return "test";
	}
}
