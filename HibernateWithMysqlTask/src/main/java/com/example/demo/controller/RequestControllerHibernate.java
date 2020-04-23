package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.pojo.LoginPojo;
import com.example.demo.serviceImpl.DbServiceImple;
import com.example.demo.serviceImpl.LoginServiceImpl;

@Controller
public class RequestControllerHibernate 
{
   @Autowired
   public LoginServiceImpl loginserviceimpl;
     
  @GetMapping("/LoginIDandPassword")
  public String printidandpassword()
  {
	  loginserviceimpl.print_idandpassword();
	  return "homePage";
  }
  
  @GetMapping("/InsertRecords")
  public String insertdata(@ModelAttribute("") LoginPojo loginpojo_obj,BindingResult bind)
  {
	  if(bind.hasErrors())
		  return "errorPage";
	  
	  System.out.println("ID : "+loginpojo_obj.getId()+" Name : "+loginpojo_obj.getName()+" Address : "+loginpojo_obj.getAddress()+" cell : "+loginpojo_obj.getContact()+" City : "+loginpojo_obj.getCity());
	  loginserviceimpl.insertemployeData(loginpojo_obj);
	  return "homePage";
  } 
  
  
  
}