package com.asma.BurgerTracker1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asma.BurgerTracker1.models.Burger;
import com.asma.BurgerTracker1.services.BurgerService;

@RestController
public class BurgerAPI {
	
	
	private final BurgerService burgerService;
	
	public BurgerAPI(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	
	@RequestMapping("/api/burgers")
	public List<Burger> getAllBurgers(){
		return burgerService.allBurgers();		
	}
	
	@PostMapping("/api/burgers")
	public Burger newBurger(@RequestParam(value="burgerName") String burgerName,
			@RequestParam(value="restaurantName") String restaurantName,
			@RequestParam(value="rating") Integer rating,
			@RequestParam(value="notes") String notes) {
		
		Burger burger = new Burger(burgerName, restaurantName, rating, notes);
			
			return burgerService.createBurger(burger);
		
	}
	 //find One book
	 @RequestMapping(value="/api/burgers/{id}", method=RequestMethod.GET)
	 public Burger findOne(@PathVariable("id") Long id) {
		 Burger book = burgerService.findBurger(id);
		 return book;
	 }
	 
	 
	 
	 // update
	 @RequestMapping(value="/api/burgers/{id}", method=RequestMethod.PUT)
	 public Burger updateBurger(
	 		@PathVariable("id") Long id, 
	 		@RequestParam(value="burgerName") String burgerName,
			@RequestParam(value="restaurantName") String restaurantName,
			@RequestParam(value="rating") Integer rating,
			@RequestParam(value="notes") String notes) {
		 Burger burger = new Burger(burgerName, restaurantName, rating, notes);
	     return burgerService.updateBurger(burger);
	 }
	
	@DeleteMapping("/api/burgers/{id}")
	public void destory(@PathVariable("id") long id) {
		burgerService.deleteBurger(id);
	}

}
