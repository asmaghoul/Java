package com.asma.DojosAndNinjas.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.asma.DojosAndNinjas.models.Dojo;

public interface dojorepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
}