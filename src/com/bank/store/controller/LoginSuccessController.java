package com.bank.store.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.bcel.internal.generic.RETURN;

@Controller
public class LoginSuccessController {
	@RequestMapping(value="/loginSuccess",method=RequestMethod.POST)
	public String  login(@RequestParam("username") String userName,@RequestParam("password") String passWord, Model model,
			HttpServletRequest request, HttpServletResponse resonse) { 
		String resultPage="login";
		HttpSession session = request.getSession (false);
		System.out.println("ID:"+session.getId());
		if (null != session)
		{
				session.invalidate ();
				session = request.getSession(true);
				System.out.println("ID:::-->"+session.getId());
				session.setAttribute("isValidate",true);
				 resultPage="charts";
		}
		   return resultPage;
	}
	@RequestMapping("/logout")
	public String  logOut(Model model,HttpServletRequest request, HttpServletResponse resonse) 
	{
		request.getSession().invalidate();
		 return "login";
	}
	@RequestMapping("/dashBoard")
	public String  dashBoard(Model model,HttpServletRequest request, HttpServletResponse resonse) 
	{
		  return "hello";
	}
    @RequestMapping("/reports")
	public ModelAndView  charts(Model model,HttpServletRequest request, HttpServletResponse resonse) 
	{		
		    return  new ModelAndView("reports");
	}
    @RequestMapping("/tables")
	public String  tables(Model model,HttpServletRequest request, HttpServletResponse resonse) 
	{		
			System.out.println("HERE WE ARE...");
		    return "tables";
	}
    @RequestMapping("/forms")
	public ModelAndView forms(Model model,HttpServletRequest request, HttpServletResponse resonse) 
	{		
    	System.out.println("we are in the form method");
		return new ModelAndView("forms");
	}
}
