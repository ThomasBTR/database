package com.safetynet.database.repositories;

import com.safetynet.database.entities.PersonEntity;
import com.safetynet.models.PersonJson;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
	public PersonEntity save(PersonJson person);

}
