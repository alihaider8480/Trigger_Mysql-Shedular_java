package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.LoginPojo;

@Service
public interface LoginService 
{
  public void print_idandpassword();
  public void insertemployeData(LoginPojo obj);
}
