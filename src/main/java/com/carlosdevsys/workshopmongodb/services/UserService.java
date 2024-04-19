package com.carlosdevsys.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosdevsys.workshopmongodb.domain.User;
import com.carlosdevsys.workshopmongodb.repository.UserRepository;
import com.carlosdevsys.workshopmongodb.services.exception.ObjectNotFoundExcepition;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		  return repo.findAll();
	}
	
	public User findById(String id) {
		
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepition("Objeto não encontrado"));
		
	}
}
