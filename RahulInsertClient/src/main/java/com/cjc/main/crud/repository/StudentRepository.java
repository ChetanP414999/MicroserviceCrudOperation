package com.cjc.main.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
