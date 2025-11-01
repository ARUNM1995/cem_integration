package com.jsp.mvcapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/hi")
    public String m1() {
		System.out.println("Hello world, m1 handler is invoked");

		



   // i made some Changes




    	return "index.jsp" ;
    }
}
