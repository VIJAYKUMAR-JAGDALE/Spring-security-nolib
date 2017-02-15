package com.test.store.dao;

import java.util.List;

import com.storemanagment.vo.UserRegistrationBean;

public interface UserOprationsDao {
int addCustomer(UserRegistrationBean bean);
   List getAllUsers();
   List getAuthorities(String userName);
}
