package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//@RequestMapping("/home")
	@RequestMapping("/home")
	public String home(){
		System.out.println("Code to demonstrate on Simple"+"Web Application");
		return "home.jsp";
	}
	
	
}
