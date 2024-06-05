package com.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id@GeneratedValue
	public int id;
	public String user_Name;
	public String email_Id;
	public long phone;
	public String password;

	public Customer() {
		
	}

	public Customer(int id, String user_Name, String email_Id, long phone, String password) {
		super();
		this.id = id;
		this.user_Name = user_Name;
		this.email_Id = email_Id;
		this.phone = phone;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [user_Name=" + user_Name + ", email_Id=" + email_Id + ", phone=" + phone + ", password="
				+ password + "]";
	}

}
