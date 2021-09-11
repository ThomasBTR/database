package com.safetynet.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allergene {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String allergene;

	public Allergene(String allergene) {
		this.allergene = allergene;
	}

	public Allergene() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAllergene() {
		return allergene;
	}

	public void setAllergene(String allergene) {
		this.allergene = allergene;
	}
}
