package com.storemanagment.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
@Id
private long userid;
private String userName;
private String passWord;
private int enabled;
public long getUserid() {
	return userid;
}
public void setUserid(long userid) {
	this.userid = userid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public int getEnabled() {
	return enabled;
}
public void setEnabled(int enabled) {
	this.enabled = enabled;
}
}
