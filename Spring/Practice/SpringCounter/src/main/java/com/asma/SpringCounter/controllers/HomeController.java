package com.asma.SpringCounter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	int count=0;
	int countTwo=0;
	@GetMapping("")
	
	
	public String home(HttpSession session) {
		
		count++;
		countTwo++;
		countTwo++;
		
	        session.setAttribute("count", String.valueOf(count));
	        session.setAttribute("countTwo", String.valueOf(countTwo));
	        
	        //System.out.println(String.valueOf(count));
	        System.out.println(String.valueOf(countTwo));
	        System.out.println(countTwo);
	      
		
		return "home.jsp";
	}

	@GetMapping("/counter")
	public String index(HttpSession session) {
		session.getAttribute("count");
		
		return "index.jsp";
	}
	@GetMapping("/counterTwo")
	public String counterTwo(HttpSession session) {
		session.getAttribute("countTwo");
		
		return "counterTwo.jsp";
	}
	
	

}
