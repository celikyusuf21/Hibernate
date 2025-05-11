package com.hibernatedemo;

import javax.persistence.*; // ekleyecegimiz tum anotationlari aliriz.


@Entity  // Belileyecegimiz veri tabani nesnesinin oldugunu belirtir.
@Table(name="customers") // Veri tabanimizdaki hangi tablodan aldigimizi belirtiriz.

public class Northwind {
	
	@Id
	@Column(name="id") // veri tabaninda bulunan kolonlarimizin ismini bire bir ayni sekilde burya yaziyoruz.
	private int id;
	
	@Column(name="company")
	private String company;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="email_address")
	private String email;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
