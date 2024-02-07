package com.asma.NinjaGoldGame.controllers;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;




@Controller
public class HomeController {
	
	@RequestMapping("/activities")
    public String activities() {
		return "activities.jsp";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
    public String index(HttpSession session,
    		@RequestParam(value="farm", required=false) String farm,
    		@RequestParam(value="cave", required=false) String cave,
    		@RequestParam(value="house", required=false) String house,
    		@RequestParam(value="quest", required=false) String quest,
    		@RequestParam(value="spa", required=false) String spa,
    		@RequestParam(value="reset", required=false) String reset) {
        int gold=0;
        ArrayList<String> activities = new ArrayList<String>();
        SimpleDateFormat simpleFormat=new SimpleDateFormat("MMMMM d Y h:mm a");
        
        if (session.getAttribute("gold")==null) {
        	session.setAttribute("gold",gold);
        	session.setAttribute("activities",activities);
        	
        }else {
        	gold=(int)session.getAttribute("gold");
        	activities=(ArrayList<String>) session.getAttribute("activities");
        }
        if(farm !=null) {
        	int earnedGold=new Random().nextInt(11)+10;
        	gold+= earnedGold;
        	activities.add(0,"You entered a farm and earned "+earnedGold+"Gold. On "+simpleFormat.format(new Date()));
        	session.setAttribute("activities",activities);
        	session.setAttribute("gold",gold);
        	 return "redirect:/";
        }
        if(cave !=null) {
        	int earnedGold=new Random().nextInt(6)+5;
        	gold+= earnedGold;
        	activities.add(0,"You entered a cave and earned "+earnedGold+"Gold. On "+simpleFormat.format(new Date()));
        	session.setAttribute("activities",activities);
        	session.setAttribute("gold",gold);
        	 return "redirect:/";
        }
        if(house !=null) {
        	int earnedGold=new Random().nextInt(4)+2;
        	gold+= earnedGold;
        	activities.add(0,"You entered a house and earned "+earnedGold+"Gold. On "+simpleFormat.format(new Date()));
        	session.setAttribute("activities",activities);
        	session.setAttribute("gold",gold);
        	 return "redirect:/";
        }
        if(quest !=null) {
        	int earnedGold=new Random().nextInt(101)-50;
        	gold+= earnedGold;
        	if (earnedGold>=0) {
            	activities.add(0,"You entered a quest and earned "+earnedGold+"Gold. On "+simpleFormat.format(new Date()));
        	}else {
        		activities.add(0,"You failed a farm and lost "+(earnedGold* -1)+"Gold. On "+simpleFormat.format(new Date()));
        	}
        	
        	session.setAttribute("activities",activities);
        	session.setAttribute("gold",gold);
        	 return "redirect:/";
        }
        if(spa !=null) {
        	int earnedGold=new Random().nextInt(6)+15;
        	gold+= earnedGold;
        	activities.add(0,"You failed a spa and lost "+earnedGold+"Gold. On "+simpleFormat.format(new Date()));
        	session.setAttribute("activities",activities);
        	session.setAttribute("gold",gold);
        	 return "redirect:/";
        }
        if(reset !=null) {
        	session.setAttribute("gold",0);
        	return "redirect:/";
        }
        
	
        return "index.jsp";
	}  
}


