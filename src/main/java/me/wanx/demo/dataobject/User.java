package me.wanx.demo.dataobject;

import me.wanx.demo.dataobject.tbl.UserTbl;

public class User extends UserTbl {
	
	public User(Long id,String name){
		this.id = id;
		this.name = name;
	}
	
	public User(String name){
		this.name = name;
	}
	
	public User(){
		
	}
	
	@Override
	public String toString() {
		return this.id+"-->"+this.name;
	}
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null == obj){
			return false;
		}
		if(this == obj){
			return true;
		}
		if(obj instanceof User){
			return ((User)obj).id == this.id ? true : false ;
		}
		return false;
	}

}
