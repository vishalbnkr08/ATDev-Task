package com.atdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atdev.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	Student getByEmail(String email) ;
}
