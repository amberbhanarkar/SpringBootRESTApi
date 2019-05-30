package com.springboot.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootrestapi.model.Family;
import com.springboot.springbootrestapi.model.repository.FamilyRepository;
@Service
public class FamilyDao {
	
	@Autowired
	FamilyRepository familyRepository;
	
	/*To create a employee*/
	public Family create(Family fam) {
		return familyRepository.save(fam);
	}
	
	/*Read employee Details*/
	public List<Family> findAll(){
		return familyRepository.findAll();
	}
	
	
	/*Update employee details*/
	public Family findOne(Long famid) {
		return familyRepository.findOne(famid);
	}
	
	
	/*Delete a Employee*/
	public void delete(Family fam) {
		familyRepository.delete(fam);
	}
}
