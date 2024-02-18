package com.asma.SaveTravel.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asma.SaveTravel.models.Expense;
import com.asma.SaveTravel.repositories.ExpenseRepository;

//import jakarta.persistence.EntityNotFoundException;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepository;
	
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
 // creates an expense
    public Expense createExpense(Expense e) {
        return expenseRepository.save(e);
    }
    //update an Expense
    public Expense updateExpense(Expense e) {
        return expenseRepository.save(e);
    }
   
 
    // retrieves an expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    
    public void deleteExpense(Long id) {
    	expenseRepository.deleteById(id);
    }

}