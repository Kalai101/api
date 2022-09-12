package com.samco.CrudApiSpringBoot.CustomerController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.CrudApiSpringBoot.CustomerModel.Customer;
import com.samco.CrudApiSpringBoot.CustomerService.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/savecustomer")
	public Customer PostCustomers(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	@GetMapping("/getcustomers")
	public List<Customer> GetCustomers(Customer customer) {
		return customerService.findAllCustomer(customer);
	}
	@GetMapping("/{id}")
	public Optional<Customer> getCustomersId(@PathVariable Integer id) {
		return customerService.getCustomerId(id);
	}
	@DeleteMapping("/deletecustomers")
	public void deleteCustomer() {
		 customerService.deleteCustomer();
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@RequestBody Customer customer,@PathVariable Integer id) {
		if( id == customer.getCustomerid()) {
		 customerService.updateCustomer(customer);
		 return new ResponseEntity<>("Table is updated:",HttpStatus.OK);
    }else {
	      return new ResponseEntity<>("Cannot find " + customer, HttpStatus.NOT_FOUND);
	    }
	
	}
}
