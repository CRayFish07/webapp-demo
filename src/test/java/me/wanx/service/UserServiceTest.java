package me.wanx.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import me.wanx.BaseTest;
import me.wanx.demo.action.Hi;
import me.wanx.demo.service.UserService;
public class UserServiceTest extends BaseTest {
	private static final Logger logger = LoggerFactory.getLogger(Hi.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testUserService(){
		logger.info("====================:"+userService);
	}
	
}
