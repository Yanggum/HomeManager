package com.tia.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tia.entity.LoginInfo;

@Repository
@Mapper
public interface LoginDao {
	
	LoginInfo getLoginInfo();
}
