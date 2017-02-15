package com.bank.store.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AllMenuNavigation {

	@RequestMapping("/createOrder")
	public ModelAndView createOrder(ModelMap model,HttpServletRequest request, HttpServletResponse resonse) 
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		model.addObject("userName",authentication.getName());
		return new ModelAndView("createOrder");
	}
}
