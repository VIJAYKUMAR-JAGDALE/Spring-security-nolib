package com.bank.store.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.storemanagment.vo.UserRegistrationBean;
import com.test.store.bo.UserOperationsBo;

@Controller
public class LoginController {
	@Autowired
	private UserOperationsBo userOperationsBo;
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView printMessage(ModelMap model, Principal principal,HttpServletRequest req, HttpServletResponse resp) {
		String url = "login";
		if (req.isUserInRole("ROLE_USER")) {
			url = "reports";
		} else if (req.isUserInRole("ROLE_MB_ADMIN")) {
			//List userList=userOperationsBo.getAllUsers();
		 /*for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
			UserRoles object = (UserRoles) iterator.next();
			System.out.println(object.getRole_name());
		}*/
			 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			 List<GrantedAuthority> autorities=new ArrayList<GrantedAuthority>(auth.getAuthorities());
			 List roles=userOperationsBo.getAuthorities(auth.getName());
			 for (Iterator iterator = roles.iterator(); iterator.hasNext();) {
				 Object object = (Object) iterator.next();
				 autorities.add(new GrantedAuthorityImpl(object.toString()));
			}
			 Authentication newAuth=new UsernamePasswordAuthenticationToken(auth.getPrincipal(),auth.getCredentials(),autorities);
			 SecurityContextHolder.getContext().setAuthentication(newAuth);
		      String name = auth.getName();   //get logged in username
		      boolean pass=auth.isAuthenticated();
			/*model.addObject("userList", userList);*/
			model.addObject("roleName", auth.getAuthorities());
			model.addObject("userName",auth.getName());
			url = "hello";
		}else if (req.isUserInRole("ROLE_TEMP_USER")) {
			url = "welcome";
		}
           return new ModelAndView(url);
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login(ModelMap model) {
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/failLogin", method = RequestMethod.GET)
	public String failedLogin(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}
	@RequestMapping(value = "/logoff", method = RequestMethod.GET)
	public String logoff(ModelMap model) {
		return "login";
	}
	@RequestMapping(value = "/newcustomer", method = RequestMethod.GET)
	public ModelAndView newCustomer(ModelMap model) {
		return new ModelAndView("newCustomerRegistration", "userRegistrationBean", new UserRegistrationBean());
	}
}
