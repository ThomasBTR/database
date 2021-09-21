package com.safetynet.database.repositories;

import com.safetynet.database.entities.AllergeneEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AllergeneRepository extends JpaRepository<AllergeneEntity, Long> {
}
