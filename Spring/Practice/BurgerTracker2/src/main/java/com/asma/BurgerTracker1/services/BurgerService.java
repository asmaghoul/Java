package com.asma.BurgerTracker1.services;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asma.BurgerTracker1.models.Burger;
import com.asma.BurgerTracker1.repositories.BurgerRepository;

//import jakarta.persistence.EntityNotFoundException;

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
    //update Burger
    public Burger updateBurger(Burger b) {
        return burgerRepository.save(b);
    }
   
    //public Burger updateBurger(Long id, Burger updatedBurger) {
        // Retrieve the existing Burger object from the database using its ID
      //  Optional<Burger> optionalBurger = burgerRepository.findById(id);
      //  if (optionalBurger.isPresent()) {
        //    Burger existingBurger = optionalBurger.get();
            
            // Update the properties of the existing Burger object with the new values
         //   existingBurger.setBurgerName(updatedBurger.getBurgerName());
         //   existingBurger.setRestaurantName(updatedBurger.getRestaurantName());
         //   existingBurger.setRating(updatedBurger.getRating());
         //   existingBurger.setNotes(updatedBurger.getNotes());

            // Save the updated Burger object back to the database
           // return burgerRepository.save(existingBurger);
      //  } else {
            // Handle the case where the Burger with the given ID is not found
          //  throw new EntityNotFoundException("Burger not found with id: " + id);
       // }
   // }
    // retrieves a book
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
    
    public void deleteBurger(Long id) {
    	burgerRepository.deleteById(id);
    }

}
