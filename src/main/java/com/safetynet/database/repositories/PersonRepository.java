package com.safetynet.database.repositories;

import com.safetynet.database.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	public PersonEntity save(org.safetynet.models.Person person);

}
