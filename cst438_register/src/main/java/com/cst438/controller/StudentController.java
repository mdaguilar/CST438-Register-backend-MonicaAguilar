package com.cst438.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cst438.domain.Course;
import com.cst438.domain.Enrollment;
import com.cst438.domain.ScheduleDTO;
import com.cst438.domain.Student;
import com.cst438.domain.StudentRepository;

@RestController
public class StudentController {
	
	@PostMapping("/student")
	public void createNewStudent(String email, String name) {
		
		//// if email does not exist, create new student
		//if (StudentRepository.findByEmail(email)) {
			Student s = new Student();
			s.setEmail(email);
			s.setName(name);
		//}
		
	}
	
	@PostMapping("/student")
	public void putHold(Student s) {
		s.setStatusCode(1);
	}
	
	@PostMapping("/student")
	public void releaseHold(Student s) {
		s.setStatusCode(0);
	}
	

}
