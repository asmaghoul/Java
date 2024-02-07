package com.asma.OmikujiFormAss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class HomeController {
	@GetMapping("")
	public String index() {
		System.out.println("Hello Console!");
		return "index.jsp";
	}
	@GetMapping("/show")
	public String show() {
		System.out.println("Hello Omikuji!");
		return "show.jsp";
	}
	
	@PostMapping("/show")
	public String createOmikuji(HttpSession session,
			@RequestParam(value="city") String city,
			@RequestParam(value="personName") String personName,
			@RequestParam(value="number") String number,
			@RequestParam(value="occupation") String occupation,
	        @RequestParam(value="thing") String thing,
	        @RequestParam(value="niceWord") String niceWord){
		session.setAttribute("city", city);
		session.setAttribute("personName",personName);
		session.setAttribute("number",number);
		session.setAttribute("occupation",occupation);
		session.setAttribute("thing",thing);
		session.setAttribute("niceWord",niceWord);
		//System.out.println("Hello Omikuji!");
		return "redirect:/omikuji/show";
	}

}
