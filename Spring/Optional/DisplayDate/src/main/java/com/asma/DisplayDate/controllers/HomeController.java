package com.asma.DisplayDate.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	 @RequestMapping("/")
	    public String index(Model model) {
		 model.addAttribute("title", "Time Dashboard");
		
	        return "index.jsp";
	 }
	
	 @RequestMapping("/date")
	    public String date(Model model) {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEE, MMM d ,yyyy");
	        Date currentDate = new Date();
	        String formattedDate = dateFormat.format(currentDate);
	        model.addAttribute("date", formattedDate);
	        model.addAttribute("title", "Date");
	        
	        return "date.jsp";
	 }
	 @RequestMapping("/time")
	    public String time(Model model) {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aaa");
	        Date currentDate = new Date();
	        String formattedDate = dateFormat.format(currentDate);
	        model.addAttribute("time", formattedDate);
	        model.addAttribute("title", "Time ");
	        
	        return "time.jsp";
}
}
