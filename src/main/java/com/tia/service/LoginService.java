package com.tia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tia.dao.LoginDao;
import com.tia.entity.LoginInfo;

@Service
public class LoginService {
	
	@Autowired	
	LoginDao loginDao;
	
	public LoginInfo getLoginInfo() {
		
		LoginInfo loginInfo = loginDao.getLoginInfo();		
		return loginInfo;
	}

}
