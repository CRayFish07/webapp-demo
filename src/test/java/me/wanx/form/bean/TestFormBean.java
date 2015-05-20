package me.wanx.form.bean;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import me.wanx.demo.form.bean.UserForm;

import org.junit.BeforeClass;
import org.junit.Test;




public class TestFormBean {
	public static Validator validator;
	
	@BeforeClass
	public static void init(){
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}
	
	@Test
	public void test(){
		UserForm u = new UserForm(1,"");
		Set<ConstraintViolation<UserForm>> v = validator.validate(u);
		for(ConstraintViolation<UserForm> cUser  : v ){
			System.out.println(cUser.getMessage());
		}
	}
}
