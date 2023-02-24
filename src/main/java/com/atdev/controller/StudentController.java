package com.atdev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atdev.entity.Student;
import com.atdev.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository sr ;
	
	@PostMapping("/insertstudent") 
	public String saveStudent(@RequestBody Student s) {
		sr.save(s) ;
		return "Student Save Successfully..." ;
	}
	
	@PostMapping("/updatestudent")
	public String updateStudent(@RequestBody Student s) {
		sr.save(s) ;
		return "Student Update Successfuly..." ;
	}
	
	@GetMapping("/selectstudent")
	public Student getStudent(@RequestParam int id) {
		Optional<Student> os = sr.findById(id) ;
		return os.get() ;
	}
	
	@GetMapping("/selectallstudent")
	public List<Student> getAllStudent() {
		return sr.findAll() ;
	}
	
//	select student based on the email 
	@GetMapping("/selectstudentbyemail")
	public Student getStudentByEmail(@RequestParam String email) {
		return sr.getByEmail(email) ;
	}
	
	@DeleteMapping("/deletestudent")
	public String deleteStudent(@RequestParam int id) {
		sr.deleteById(id) ;
		return "Student deleted successfully..." ;
	}
}
