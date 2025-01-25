package com.crud.cjc.main.service;

import java.util.List;

import com.crud.cjc.main.model.Student;

public interface StudentService {

	List<Student> getAllData();
	public Student findByRoll(int roll);
}
