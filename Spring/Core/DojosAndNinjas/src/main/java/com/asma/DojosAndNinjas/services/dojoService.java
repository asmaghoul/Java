package com.asma.DojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.asma.DojosAndNinjas.repositories.dojorepository;
import com.asma.DojosAndNinjas.models.Dojo;

@Service
public class dojoService {
	
	private final dojorepository repo;
    
    public dojoService(dojorepository repo) {
        this.repo = repo;
    }
    // returns all the dojos
    public List<Dojo> all() {
        return repo.findAll();
    }
    // creates a dojo
    public Dojo create(Dojo dojo) {
    	System.out.println(dojo.getId());
        return repo.save(dojo);
    }
    // retrieves a dojo
    public Dojo find(Long id) {
        Optional<Dojo> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}