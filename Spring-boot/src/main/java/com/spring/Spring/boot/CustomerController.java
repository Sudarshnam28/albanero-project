package com.spring.Spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.modal.Customer;

@RestController
public class CustomerController {

	@Autowired
	CustomerDao custDao;
	
	
	@PostMapping("registerCustomer")
	public  void registerCustomer(@RequestBody Customer cust){
		custDao.registerCustomer(cust);;
	}
	
	@RequestMapping("loginCustomer/{user_Name}/{password}/{phone}")
	public Customer loginCustomer(@PathVariable("user_Name")String user_Name,@PathVariable("password")String password,@PathVariable("phone")long phone){
		return custDao.findByUserNamePasswordPhone(user_Name,password,phone);
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers(){
		return custDao.getAllCustomers();
	}
	
	@GetMapping("getCustomerById/{id}")
	public Customer getCustomerById(@PathVariable("id")int id){
		return custDao.getCustomerById(id);
	}
}
