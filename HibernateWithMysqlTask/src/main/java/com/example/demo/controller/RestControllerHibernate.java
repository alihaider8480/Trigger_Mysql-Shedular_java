package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.LoginPojo;

@RestController
public class RestControllerHibernate 
{
	HashMap<String, String> hmap= new HashMap<String, String>();
	
   @GetMapping("/JsonData")
   public HashMap<String, String> printjsondata()
   {
	   
	    Random rand = new Random();
		String numbers = "0123456789";
		char arr[] = new char[4];
		for (int i = 0; i < 4; i++) 
		{
			arr[i] = numbers.charAt(rand.nextInt(numbers.length()));
			System.out.println(arr[i]);
		}
		String aaaa= arr.toString();
	   System.out.println("OTP Printing"+aaaa);
	   hmap.put("login_id", "63");
	   hmap.put("login_pass", "12361616");
	   hmap.put("OTP", aaaa);
	   
	   System.out.println(hmap);
	   return hmap;
	   
   }
}