package me.wanx.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.wanx.BaseTest;
import me.wanx.demo.action.UserAction;
import me.wanx.demo.service.UserService;
public class UserServiceTest extends BaseTest {
	private static final Logger logger = LoggerFactory.getLogger(UserAction.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testUserService(){
		logger.info("====================:"+userService);
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("/spring-demo.xml");
		UserService us = (UserService)app.getBean("userServiceImpl");
		testMysqlConcuttent(us);
	}
	
	public static void testMysqlConcuttent(UserService userService){
		//分10个线程去更新user 的age每次减一
		System.out.println("start...");
		for(int i = 1; i <= 10; i++){
			ExeThread e = new ExeThread(userService,i);
			new Thread(e).start();
		}
	}
	
}

class ExeThread implements Runnable{
	private UserService userService;
	private String id;
	public ExeThread(){}
	
	public ExeThread(UserService userService,int id){
		this.userService = userService;
		this.id = "Thread-"+id;
	}
	
	@Override
	public void run() {
		int i = 1;
		for(; i <= 10000; i++){
			userService.updateAge(1);
		}
		System.out.println("线程："+this.id+",执行完毕");
	}
	
}
	
