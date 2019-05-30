package com.springboot.springbootrestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootrestapi.model.Student;
import com.springboot.springbootrestapi.model.repository.StudentRepository;
@Service
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepository;
	
	/*To create a student*/
	public Student create(Student stu) {
		return studentRepository.save(stu);
	}
	
	/*Read Student Details*/
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	
	/*Update student details*/
	public Student findOne(Long stuid) {
		return studentRepository.findOne(stuid);
	}
	
	
	/*Delete a student*/
	public void delete(Student stu) {
		studentRepository.delete(stu);
	}
}
