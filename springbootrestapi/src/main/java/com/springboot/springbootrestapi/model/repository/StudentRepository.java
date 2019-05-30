package com.springboot.springbootrestapi.model.repository;

import com.springboot.springbootrestapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}