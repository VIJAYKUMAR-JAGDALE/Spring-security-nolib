package com.test.store.bo;

import java.util.List;

import com.storemanagment.vo.UserRegistrationBean;

public interface UserOperationsBo {
    int addCustomer(UserRegistrationBean bean);
    List getAllUsers();
    List getAuthorities(String userName);
}
