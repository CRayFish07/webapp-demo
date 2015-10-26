package me.wanx.demo.service;

import java.util.List;

import me.wanx.common.core.persistence.BasePagination;
import me.wanx.demo.dataobject.User;

public interface UserService {
	
	public Integer addUser(User user);
	
	public Integer updateUser(User user);
	
	public Integer deleteUser(Integer id);
	
	public List<User> getUsers();
	
	public User getUser(Integer id);
	
	public void searchUsers(BasePagination<User> userPage);
	
	public Integer updateAge(Integer Id);
}
