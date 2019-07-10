package com.hzf.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzf.dao.UserTestMapper;
import com.hzf.model.UserTest;

@Service
public class TestService {


	@Resource
	private UserTestMapper testUserMapper;

	public void insertTest() {
	UserTest user=UserTest.builder().name("bean03").build();
	testUserMapper.insertSelective(user);
	}
	public void insertTestAjax(UserTest userVo) {
		testUserMapper.insertSelective(userVo);
	}
}
