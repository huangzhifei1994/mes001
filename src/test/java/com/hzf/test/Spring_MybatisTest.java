package com.hzf.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzf.dao.UserTestMapper;
import com.hzf.model.UserTest;

public class Spring_MybatisTest {
private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
private UserTestMapper testUserMapper;
@Test
public void testMapper() {
	testUserMapper=bean.getBean(UserTestMapper.class);
	UserTest user=UserTest.builder().name("bean01").build();
	testUserMapper.insertSelective(user);
}
}
