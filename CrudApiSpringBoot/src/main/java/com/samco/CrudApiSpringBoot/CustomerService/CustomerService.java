package com.samco.CrudApiSpringBoot.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.samco.CrudApiSpringBoot.CustomerModel.Customer;
import com.samco.CrudApiSpringBoot.CustomerRepository.CustomerRepo;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}

	public List<Customer> findAllCustomer(Customer customer) {
		return customerRepo.findAll();
	}

	public Optional<Customer> getCustomerId(Integer id) {
		if (id != null) {
			return customerRepo.findById(id);
		} else
			return Optional.empty();
	}

	public void deleteCustomer() {

		customerRepo.deleteAll();
	}

	public Customer updateCustomer(Customer customer) {

		Integer id = customer.getCustomerid();
		Customer c = customerRepo.findById(id).get();
		/*
		 * c.setCustomerid(customer.getCustomerid());
		 * c.setCustomername(customer.getCustomername());
		 */
		c.setProductcategory(customer.getProductcategory());
		c.setProductname(customer.getProductname());
		return customerRepo.save(c);

	}
	
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from BOOKS", BeanPropertyRowMapper.newInstance(Customer.class));
	}
}
