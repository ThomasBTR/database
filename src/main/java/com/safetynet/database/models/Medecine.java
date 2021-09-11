package com.safetynet.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medecine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String medecineName;

	public Medecine(String medecineName) {
		this.medecineName = medecineName;
	}

	public Medecine() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedecineName() {
		return medecineName;
	}

	public void setMedecineName(String medecineName) {
		this.medecineName = medecineName;
	}
}
