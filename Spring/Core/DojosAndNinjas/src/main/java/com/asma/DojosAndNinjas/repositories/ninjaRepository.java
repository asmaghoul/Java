package com.asma.DojosAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.asma.DojosAndNinjas.models.Dojo;
import com.asma.DojosAndNinjas.models.Ninja;

public interface ninjaRepository extends CrudRepository<Ninja, Long> {
		
		List<Ninja> findAll();
		List<Ninja> findAllByDojo(Dojo dojo);
	}
