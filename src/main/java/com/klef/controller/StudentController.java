package com.klef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.model.Student;
import com.klef.service.StudentService;

@RestController
@RequestMapping("studentapi")
public class StudentController
{
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String studenthome() 
	{
		return "Student Controller Home Page";
	}

}
