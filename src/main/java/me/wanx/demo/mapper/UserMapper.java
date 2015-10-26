package me.wanx.demo.mapper;

import java.util.List;
import java.util.Map;

import me.wanx.common.core.persistence.BaseMapper;
import me.wanx.demo.dataobject.User;

public interface UserMapper<T extends User> extends BaseMapper<T> {
	
	public List<User> searchUsers(Map<String,Object> map);
	
	public int countUsers(Map<String,Object> map);
	
	public int updateAge(Integer id);
}
