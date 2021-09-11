package com.safetynet.database.models;

import javax.persistence.*;

@Entity
public class Medication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Person person;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Medecine medecine;
	private int dosage;


	public Medication(Person person, Medecine medecine, int dosage) {
		this.person = person;
		this.medecine = medecine;
		this.dosage = dosage;
	}

	public Medication() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Medecine getMedecine() {
		return medecine;
	}

	public void setMedecine(Medecine medecine) {
		this.medecine = medecine;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
}




