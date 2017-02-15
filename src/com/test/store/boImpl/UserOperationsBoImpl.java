package com.test.store.boImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.storemanagment.vo.UserRegistrationBean;
import com.test.store.bo.UserOperationsBo;
import com.test.store.dao.UserOprationsDao;
@Component
public class UserOperationsBoImpl implements UserOperationsBo {
	@Autowired  
	private UserOprationsDao userOprationsDao;
	
	@Override
	public int addCustomer(UserRegistrationBean bean) {
		userOprationsDao.addCustomer(bean);
		return 0;
	}

	@Override
	public List getAllUsers() {
		return userOprationsDao.getAllUsers();
	}
	@Override
	public List getAuthorities(String userName) {
		return userOprationsDao.getAuthorities(userName);
	}

}
