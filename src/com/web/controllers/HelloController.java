package com.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aks.database.UserDAO;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
		System.out.println("Check");
		userDAO.getTotalNumberOfUsers();
		return "hello";
    }
}
