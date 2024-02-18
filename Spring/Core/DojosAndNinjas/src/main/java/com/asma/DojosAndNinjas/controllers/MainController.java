package com.asma.DojosAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.asma.DojosAndNinjas.models.Dojo;
import com.asma.DojosAndNinjas.models.Ninja;
import com.asma.DojosAndNinjas.services.dojoService;
import com.asma.DojosAndNinjas.services.ninjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	// Services
	@Autowired
	private ninjaService ninjas;
	@Autowired
	private dojoService dojos;
	
	// All Rendering GET Routes
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojoForm.jsp";
	}
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "newNinjaForm.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		System.out.printf("dojo id from url: %s",id);
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		
		return "showDojo.jsp";
	}
	// All processing POST / Redirect routes
	
		@PostMapping("/dojos")
		public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
	        if (result.hasErrors()) {
	            return "newDojoForm.jsp";
	        } else {
			Dojo newDojo = dojos.create(dojo);
			System.out.printf("new id: %s", dojo.getId());
			
			return String.format("redirect:/dojos/%s",newDojo.getId());
	        }
		}
		@PostMapping("/ninjas")
		public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
	        if (result.hasErrors()) {
	            return "newNinjaForm.jsp";
	        } else {
			ninja = ninjas.create(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId();
	        }
		}
		
}