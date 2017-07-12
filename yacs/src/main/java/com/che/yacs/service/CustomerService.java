package com.che.yacs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.che.yacs.model.Customer;
import com.che.yacs.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		for (Customer c : customerRepository.findAll()) {
			customers.add(c);
			
		}
		return customers;
		
	}
	
	public Customer findCustomer(int id) {
		return customerRepository.findOne(id);
		
	}
	
	public Customer findCustomer(String firstName) {
		return customerRepository.findByFirstName(firstName);
	}
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(int id) {
		customerRepository.delete(id);
	}
	
}
