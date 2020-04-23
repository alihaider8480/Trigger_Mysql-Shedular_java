package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.LoginPojo;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{
    @Autowired
    public LoginServiceImpl loginServiceImpl_obj;
 
    @Autowired
    public LoginRepository loginrepository_obj;
 
    
    //@Autowired(required = false)
    public LoginPojo loginpojo_obj= new LoginPojo();
    
    
     
	@Override
	public void print_idandpassword() 
	{
		System.out.println(loginpojo_obj);
		System.out.println("calling geeter");
		//loginpojo_obj.setId(1);
		//loginpojo_obj.setPassword("12345679*");
		//System.out.println(loginpojo_obj.getId()+" ID " + loginpojo_obj.getPassword() + " Passowrd");
	    System.out.println("aaaaaaaaaa");
	}

	@Override
	public void insertemployeData(LoginPojo obj) 
	{
		loginrepository_obj.save(obj);
	}
	
	
	
}