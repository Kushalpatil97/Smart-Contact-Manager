package com.smartcntmgr.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smartcntmgr.entity.User;

@Controller
public class HomeController {

	@GetMapping(value ="/Home")
	public String Home() {
		return "Home.html";
	}
	
	@GetMapping(value ="/about")
	public String about(Model model) {
		model.addAttribute("title","Smart contact Manager"); 
		return "about.html";
	}
	@GetMapping(value ="/Signup")
	public String signup(Model model) {
		model.addAttribute("title","Smart contact Manager");
		return "Signup.html";
	}
	@GetMapping(value ="/Login")
	public String login(Model model) {
		model.addAttribute("title","Smart contact Manager"); 
		return "Login.html";  
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String Register(@Valid @ModelAttribute("User") User user,BindingResult result,Model model) {
		System.out.println(user); 
		model.addAttribute("msg","Registered!!!!!");
		return "Signup.html";
	}
}
