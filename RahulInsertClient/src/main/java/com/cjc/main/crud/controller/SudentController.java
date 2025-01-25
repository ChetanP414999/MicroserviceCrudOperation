package com.cjc.main.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.crud.model.Student;
import com.cjc.main.crud.service.StudentService;

@RestController
public class SudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody Student s)
	{
		ss.saveStudent(s);
		return "datasave";
	}
}
