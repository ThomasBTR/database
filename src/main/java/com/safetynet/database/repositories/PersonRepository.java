package com.safetynet.database.repositories;

import com.safetynet.database.entities.MedicationEntity;
import com.safetynet.database.entities.PersonEntity;
import com.safetynet.models.PersonJson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

	@Query("SELECT p from PersonEntity p WHERE p.addressEntity.station =:variable")
	List<PersonEntity> findPersonEntitiesByAddressEntityStation(@Param("variable") int stationNumber);

}
