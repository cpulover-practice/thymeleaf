package com.cpulover.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("date", new java.util.Date());
		return "home";
	}
}
