package me.wanx.demo.form.bean;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

public class UserForm implements Serializable{
	
	private static final long serialVersionUID = 1498664507970273186L;
	
	public UserForm(){};
	
	public UserForm(Integer id,String name){
		this.id = id;
		this.name = name;
	};

	@Min(2)
	private int id;
	
	@NotEmpty(message="name不能为空")
	@Size(min=5,max=10)
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
