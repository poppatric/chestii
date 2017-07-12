package com.che.yacs.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.che.yacs.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
	
	public Customer findByFirstName(String firstName);
	
	public List<Customer> findByLastName(String lastName);
	
}
