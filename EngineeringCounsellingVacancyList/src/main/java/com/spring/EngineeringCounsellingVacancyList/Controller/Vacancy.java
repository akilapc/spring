package com.spring.EngineeringCounsellingVacancyList.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.EngineeringCounsellingVacancyList.model.Counselling;
import com.spring.EngineeringCounsellingVacancyList.service.CounsellingService;

@RestController
@RequestMapping("/api")
public class Vacancy {
	@Autowired
	private CounsellingService service;
	@GetMapping
	public List<Counselling> read()
	{
		return service.getcounsellings();
	}
	@GetMapping("/{SERIALNO}")
	public Optional<Counselling> readBySERIALNO(@PathVariable int SERIALNO)
	{
		return service.getCounsellingbyId(SERIALNO);
	}
	@PostMapping()
	public Counselling create(@RequestBody Counselling couns)
	{
		return service.addCounselling(couns);
	}
	@PutMapping("/{SERIALNO}")
	public Counselling update(@RequestBody Counselling cous, @PathVariable int SERIALNO)
	{
		return service.editCounselling(cous, SERIALNO);
	}
	@DeleteMapping("/{SERIALNO}")
	public String delete(@PathVariable int SERIALNO)
	{
		return service.deleteCounselling(SERIALNO);
	}
	

}
