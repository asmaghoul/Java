package com.asma.DojosAndNinjas.services;
 import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.asma.DojosAndNinjas.repositories.ninjaRepository;

import com.asma.DojosAndNinjas.models.Dojo;
import com.asma.DojosAndNinjas.models.Ninja;
@Service
public class ninjaService {
	private final ninjaRepository repo;
    
    public ninjaService(ninjaRepository repo) {
        this.repo = repo;
    }
    // returns all the books
    public List<Ninja> all() {
        return repo.findAll();
    }
    // creates a book
    public Ninja create(Ninja ninja) {
        return repo.save(ninja);
    }
    // retrieves a book
    public Ninja find(Long id) {
        Optional<Ninja> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    public List<Ninja> byDojo(Dojo dojo) {
    	return repo.findAllByDojo(dojo);
    }
}