package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String login() {
		System.out.println("LoginController login()");
		return "login";
	}
	@GetMapping("/loginfailed")
	public String loginerror(Model model) {
		System.out.println("LoginController loginerror()");
		model.addAttribute("error","true");
		return "login";
	}
	@GetMapping("/logout")
	public String logout(Model model) {
		return "login";
	}
}
