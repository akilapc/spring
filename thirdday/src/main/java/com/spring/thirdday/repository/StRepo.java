package com.spring.thirdday.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.thirdday.model.Student;

public interface StRepo extends JpaRepository<Student,Integer> {

}
