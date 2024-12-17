package com.ecommerce.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping; 


@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/signin")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/view_product")
	public String view_product() {
		return "view_product";
	}
	
	@GetMapping("/product")
	public String product() {
		return "product";
	}
	
	@GetMapping("/forgot-password")
	public String showForgotPassword() {
		return "forgot_password.html";
	}
}
