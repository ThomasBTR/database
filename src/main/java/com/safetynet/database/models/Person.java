package com.safetynet.database.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	private String email;
	private String phone;
	@Embedded
	private Address address;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="allergies", joinColumns = @JoinColumn(name="person_id"))
	private List<Allergene> allergies;
	@OneToMany(mappedBy="person")
	private List<Medication> medications;

	public Person() {

	}

	public Person(String firstName, String lastName, LocalDate birthdate, String email, String phone, Address address, List<Allergene> allergies) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.allergies = allergies;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
