package com.crud.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.repository.StudentRepository;
import com.crud.cjc.main.service.StudentService;
@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepository st;
	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		return st.findAll();
	}
	@Override
	public Student findByRoll(int roll) {
		// TODO Auto-generated method stub
		return st.findByRoll(roll);
	}

}
