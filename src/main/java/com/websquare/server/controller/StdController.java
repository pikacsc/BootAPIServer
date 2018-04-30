package com.websquare.server.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websquare.server.exception.ResourceNotFoundException;
import com.websquare.server.model.Student;
import com.websquare.server.repo.StdRepository;

@RestController
@RequestMapping("/api")
public class StdController {
	
	@Autowired
	StdRepository stdRepository;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
	    return stdRepository.findAll();
	}
	
	@PostMapping("/students")
	public Student createStudent(@Valid @RequestBody Student student) {
	    return stdRepository.save(student);
	}
	
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable(value = "id") Long stdId) {
	    return stdRepository.findById(stdId)
	            .orElseThrow(() -> new ResourceNotFoundException("Student", "id", stdId));
	}
	
	
	
}
