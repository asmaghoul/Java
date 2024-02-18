package com.asma.SaveTravel.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.asma.SaveTravel.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    // this method retrieves all the books from the database
    List<Expense> findAll();
   
  
}