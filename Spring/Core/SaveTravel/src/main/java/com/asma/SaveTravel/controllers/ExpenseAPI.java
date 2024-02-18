package com.asma.SaveTravel.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asma.SaveTravel.models.Expense;
import com.asma.SaveTravel.services.ExpenseService;

@RestController
public class ExpenseAPI{
	
	
	private final ExpenseService expenseService;
	
	public ExpenseAPI(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	
	@RequestMapping("/api/expenses")
	public List<Expense> getAllExpenses(){
		return expenseService.allExpenses();		
	}
	
	@PostMapping("/api/expenses")
	public Expense newExpense(@RequestParam(value="expenseName") String expenseName,
			@RequestParam(value="vendorName") String vendorName,
			@RequestParam(value="amount") Integer amount,
			@RequestParam(value="description") String description) {
		
		Expense expense = new Expense(expenseName, vendorName, amount, description);
			
			return expenseService.createExpense(expense);
		
	}
	 //find One expense
	 @RequestMapping(value="/api/expenses/{id}", method=RequestMethod.GET)
	 public Expense findOne(@PathVariable("id") Long id) {
		 Expense expense = expenseService.findExpense(id);
		 return expense;
	 }
	 
	 
	 
	 // update
	 @RequestMapping(value="/api/expenses/{id}", method=RequestMethod.PUT)
	 public  Expense updateExpense(
			 @RequestParam(value="expenseName") String expenseName,
				@RequestParam(value="vendorName") String vendorName,
				@RequestParam(value="amount") Integer amount,
				@RequestParam(value="description") String description) {
		 Expense expense = new Expense(expenseName, vendorName, amount, description);
	     return expenseService.updateExpense(expense);
	 }
	
	@DeleteMapping("/api/expenses/{id}")
	public void destory(@PathVariable("id") long id) {
		expenseService.deleteExpense(id);
	}

}