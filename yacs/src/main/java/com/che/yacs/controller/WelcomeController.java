package com.che.yacs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.annotations.SwaggerDefinition;

@Controller
public class WelcomeController {
	
	@GetMapping("/home")
	public String firstPage() {
		return "home";
	}

}
