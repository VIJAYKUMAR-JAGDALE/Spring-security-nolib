package com.bank.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.storemanagment.vo.UserRegistrationBean;
import com.test.store.bo.UserOperationsBo;

@Controller
public class UserOperations {
	@Autowired
	private UserOperationsBo userOperationsBo;
	@RequestMapping(value="/addNewCustomer",method=RequestMethod.POST)
	public String addUserDetails(@ModelAttribute UserRegistrationBean bean)
	{
		 System.out.println("Before insertion into database");
		 userOperationsBo.addCustomer(bean);
		return "hello";
	}
}
