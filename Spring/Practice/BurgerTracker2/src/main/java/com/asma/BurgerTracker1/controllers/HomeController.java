package com.asma.BurgerTracker1.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asma.BurgerTracker1.models.Burger;
import com.asma.BurgerTracker1.services.BurgerService;

import jakarta.validation.Valid;


@Controller
public class HomeController {
	
	private final BurgerService burgerService;
    HomeController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }
   
	
	  @GetMapping("/")
	    public String index(Model model,@ModelAttribute("burger") Burger burger) {
	    	List<Burger> burgers = burgerService.allBurgers();
	    			model.addAttribute("allBurgers", burgers);
	    			return "/burgers/index.jsp";
	    }
	  
	  //@GetMapping("/burgers")
	   // public String newBurger(@ModelAttribute("burger") Burger burger) {
	    //	return "/burgers/index.jsp";
	   // }
	  
	  @PostMapping("/burgers")
	    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
	        if (result.hasErrors()) {
	        	// Log validation errors
	            result.getAllErrors().forEach(error -> System.out.println(error.getDefaultMessage()));
	            return "/burgers/index.jsp";
	        } else {
	        	burgerService.createBurger(burger);
	    	return "redirect:/";
	        }
	    }
	  @RequestMapping("/burgers/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
		  Burger burger = burgerService.findBurger(id);
		  System.out.println(burger.getId());
		  model.addAttribute("id", id);
	        model.addAttribute("burger", burger);
	        return "/burgers/edit.jsp";
	    }
	    
	    //@RequestMapping(value="/burgers/{id}", method=RequestMethod.PUT)
	   // public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
	   //     if (result.hasErrors()) {
	    //        model.addAttribute("burger", burger);
	     //       return "/burgers/index.jsp";
	     //   } else {
	     //   	burgerService.updateBurger(burger);
	     //       return "redirect:/";
	    //    }
	   // }
	  @RequestMapping(value="/burgers/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model, @PathVariable("id") Long id ){
	        if (result.hasErrors()) {
	            return "redirect:/burgers/edit.jsp" + burger.getId(); // Redirect to the edit page with errors
	        } else {
	        	 
	            burgerService.updateBurger(burger);
	            return "redirect:/";
	        }
	    }
	  
}

