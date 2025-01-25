package com.cjc.main.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.crud.model.Student;
import com.cjc.main.crud.repository.StudentRepository;
import com.cjc.main.crud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;
	
	
	@Override
	public void saveStudent(Student s) {
		sr.save(s);
		
	}

}
