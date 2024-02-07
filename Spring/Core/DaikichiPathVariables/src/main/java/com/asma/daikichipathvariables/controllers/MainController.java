package com.asma.daikichipathvariables.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class MainController {
	@RequestMapping("")
	public String index(){
		return "Welcome!";
	}
	@RequestMapping("today")
	public String today(){
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("tomorrow")
	public String tomorrow(){
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	 @RequestMapping("/travel/{city}")
	    public String travel(@PathVariable("city") String city) {
	        return String.format("Congratulations! You will soon travel to %s",city,"!");
	    }
	 @RequestMapping("/lotto/{number}")
	    public String lotto(@PathVariable("number") Integer number) {
		 //Integer.parseInt(number.toString()
		 if (( Integer.parseInt(number.toString())%2)==0) {
			 System.out.println(Integer.parseInt(number.toString())/2);
	        return String.format("You will take a grand journey in the near future, but be weary of tempting offers");
		 }
		 return String.format("You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.");
	    }
}
