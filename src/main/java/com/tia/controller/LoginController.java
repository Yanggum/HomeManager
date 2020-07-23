package com.tia.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tia.service.LoginService;

//import com.tia.service.LoginService;

@RestController
@ComponentScan
@RequestMapping(value="/test")
public class LoginController {
	
		
	@Autowired 
	LoginService loginService;
		
	@RequestMapping(value="/", method=RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> get(HttpServletRequest request){
		HashMap<String, Object> result = new HashMap<>();
		
		result.put("data", loginService.getLoginInfo());
		
//		result.put("data", loginService.getLoginInfo());
				
		return result;//new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
	

}
