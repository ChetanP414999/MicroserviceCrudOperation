package com.crud.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	@GetMapping("/getAllData")
	public List<Student> getAllData() {
		List<Student> list=ss.getAllData();
		return list;
	}
	@GetMapping("/getByRoll/{roll}")
	public Student getDataById(@PathVariable("roll")int roll) {
		Student s=ss.findByRoll(roll);
		
		System.out.println(s);
		return s;
	}
}
