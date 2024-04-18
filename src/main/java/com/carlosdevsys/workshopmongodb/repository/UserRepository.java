package com.carlosdevsys.workshopmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlosdevsys.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	List<User> findAll();
	
}
