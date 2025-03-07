package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
	
	
	 @Query("SELECT c FROM Customer c WHERE c.user_Name = :user_Name AND c.password = :password AND c.phone= :phone")
		Customer findByUserNamePasswordPhone(String user_Name, String password,long phone);
}
