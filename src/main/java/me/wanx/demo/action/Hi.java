package me.wanx.demo.action;

import me.wanx.common.core.persistence.BasePagination;
import me.wanx.demo.dataobject.User;
import me.wanx.demo.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class Hi extends ActionSupport {
	private static final Logger logger = LoggerFactory.getLogger(Hi.class);
	
	private static final long serialVersionUID = -4556112956078567336L;

	@Autowired
	private UserService userService;
	
	private BasePagination<User> userPage;
	
	public String hi(){
		logger.info("hi maven~~");
		long id = Math.round(Math.random()*1000);
		userService.addUser(new User(id,"wanx"+Math.random()));
		return "hi";
	}
	
	public String users(){
		logger.info("开始执行users方法!");
		if(null == userPage){
			userPage = new BasePagination<User>();
		}
		//logger.info("========================:"+userPage.getCurrentPage());
		userService.searchUsers(userPage);
		return "user-list";
	}
	
	public String del(){
		this.userService.deleteUser(new Integer(1));
		return "user-list";
	}

	public BasePagination<User> getUserPage() {
		return userPage;
	}

	public void setUserPage(BasePagination<User> userPage) {
		this.userPage = userPage;
	}

}
