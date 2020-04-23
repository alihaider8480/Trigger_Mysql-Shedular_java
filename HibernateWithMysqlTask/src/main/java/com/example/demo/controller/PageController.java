package com.example.demo.controller;

import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.serviceImpl.DbServiceImple;
import com.example.demo.serviceImpl.DbTimer;

@Controller
public class PageController 
{	
	
	@Autowired
	private DbTimer db_obj;
	
	Timer t = new Timer();
	
  @GetMapping("/")
  public String gohomePage()
  {
	  System.out.println("Start.....");
	  return "homePage";
  }
  
  @GetMapping("/UserInsertPage")
  public String goinsertpage()
  {
	 // db_obj.scheduledExecutionTime();
	  //d.create_db();
	  return "insertPage";
  }
  
  @GetMapping("/QuatzShedularStarting")
  public String go_quatz_page()
  {
	  t.schedule(db_obj, 9000, 5000);
	 // d.db_maker();
	  return "insertPage";
  } 
}
