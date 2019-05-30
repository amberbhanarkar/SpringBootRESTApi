package com.springboot.springbootrestapi.model.repository;

import com.springboot.springbootrestapi.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FamilyRepository extends JpaRepository<Family, Long>{
	
}