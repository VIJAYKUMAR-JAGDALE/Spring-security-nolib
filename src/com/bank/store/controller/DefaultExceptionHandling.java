package com.bank.store.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DefaultExceptionHandling extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionMsg;
	   
	   public DefaultExceptionHandling(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	      System.out.println("Here we are");
	   }
	   
	   public String getExceptionMsg(){
	      return this.exceptionMsg;
	   }
	   
	   public void setExceptionMsg(String exceptionMsg) {
	      this.exceptionMsg = exceptionMsg;
	   }
}
