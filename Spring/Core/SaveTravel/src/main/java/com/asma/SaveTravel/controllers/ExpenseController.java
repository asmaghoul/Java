package com.asma.SaveTravel.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asma.SaveTravel.models.Expense;
import com.asma.SaveTravel.services.ExpenseService;

import jakarta.validation.Valid;


@Controller
public class ExpenseController {
	
	private final ExpenseService expenseService;
	ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }
   
	
	  @GetMapping("/")
	    public String index(Model model,@ModelAttribute("expense") Expense expense) {
	    	List<Expense> expenses = expenseService.allExpenses();
	    			model.addAttribute("allExpenses", expenses);
	    			return "/expenses/index.jsp";
	    }
	
	  
	  @PostMapping("/expenses")
	    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
	        if (result.hasErrors()) {
	        	// Log validation errors
	            result.getAllErrors().forEach(error -> System.out.println(error.getDefaultMessage()));
	            return "/expenses/index.jsp";
	        } else {
	        	expenseService.createExpense(expense);
	    	return "redirect:/";
	        }
	    }
	  @RequestMapping("/expenses/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
		  Expense expense = expenseService.findExpense(id);
		  System.out.println(expense.getId());
		  model.addAttribute("id", id);
	        model.addAttribute("expense", expense);
	        return "/expenses/edit.jsp";
	    }
	    
	  
	  @RequestMapping(value="/expenses/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model, @PathVariable("id") Long id ){
	        if (result.hasErrors()) {
	        	 model.addAttribute("expense", expense);
	        	 return "expenses/edit.jsp"; // Redirect to the edit page with errors
	        } else {
	        	 
	        	expenseService.updateExpense(expense);
	            return "redirect:/";
	        }
	    }
	  //show 
	  @RequestMapping(value="/expenses/{id}")
	    public String show( Model model, @PathVariable("id") Long id ){
		         Expense expense = expenseService.findExpense(id);
		         model.addAttribute("id", id);
	        	 model.addAttribute("expense", expense);
	        	
	            return "show.jsp";
	        
	    }
	  
	  
	  @DeleteMapping("/expenses/{id}")
	    public String destroy(@PathVariable("id") Long id) {
		  expenseService.deleteExpense(id);
	        return "redirect:/";
	    }
	 
}