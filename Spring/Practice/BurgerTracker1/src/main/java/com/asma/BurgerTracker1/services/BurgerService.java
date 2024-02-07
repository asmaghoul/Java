package com.asma.BurgerTracker1.services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asma.BurgerTracker1.models.Burger;
import com.asma.BurgerTracker1.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	private final BurgerRepository burgerRepository;
	
    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    
    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
 // creates a burger
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a book
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBook = burgerRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public void deleteBurger(Long id) {
    	burgerRepository.deleteById(id);
    }

}
