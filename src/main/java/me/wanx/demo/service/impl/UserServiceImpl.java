package me.wanx.demo.service.impl;

import java.util.List;
import java.util.Map;

import me.wanx.common.core.persistence.BasePagination;
import me.wanx.demo.dataobject.User;
import me.wanx.demo.mapper.UserMapper;
import me.wanx.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper<User> userMapper;
	
	@Override
	public Integer addUser(User user) {
		return userMapper.add(user);
	}

	@Override
	public Integer updateUser(User user) {
		return userMapper.update(user);
	}

	@Override
	public Integer deleteUser(Integer id) {
		return userMapper.del(id);
	}

	@Override
	public List<User> getUsers() {
		return userMapper.gets();
	}

	@Override
	public User getUser(Integer id) {
		return userMapper.get(id);
	}
	
	@Override
	public void searchUsers(BasePagination<User> userPage) {
		//查询总数据条数
		int totalRecord = userMapper.countUsers(userPage.getOtherQueryParams());
		userPage.setTotalRecord(totalRecord);
		//设置分页数量
		userPage.setDefaultEveryPageNum(5);
		Map<String,Object> map = userPage.getQueryParams();
		List<User> list = userMapper.searchUsers(map);
		userPage.setResults(list);
		
	}
	
}
