package com.spring.thirdday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.thirdday.model.Student;
import com.spring.thirdday.repository.StRepo;
@Service
public class StService 
{
	@Autowired
	public StRepo repo;
	public Student saveInfo(Student st)
	{
		return repo.save(st);
	}
}
