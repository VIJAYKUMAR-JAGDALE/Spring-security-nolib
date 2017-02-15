package com.storemanagment.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="USER_DETAILS")
public class UserRegistrationBean {
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private long user_id;
	private String firstName;
	private String lastName;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String passWord;
	private String email;
	private String address;
	@Column(name="ENABLED")
	private String active;
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	/*@ManyToOne
    @JoinColumn(name="ROLE_ID")
    private UserRoles roles;
	public UserRoles getRoles() {
		return roles;
	}
	public void setRoles(UserRoles roles) {
		this.roles = roles;
	}*/
}
