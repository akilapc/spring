package com.spring.EngineeringCounsellingVacancyList.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.EngineeringCounsellingVacancyList.model.Counselling;
import com.spring.EngineeringCounsellingVacancyList.repository.EngineeringCounsellingVacancyListRepository;

@Service
public class CounsellingService {
	@Autowired
	private EngineeringCounsellingVacancyListRepository repo;
	public List<Counselling> getcounsellings()
	{
		return repo.findAll();
	}
	public Optional<Counselling> getCounsellingbyId(int SERIALNO)
	{
		return repo.findById(SERIALNO);	
	}
	public Counselling addCounselling(Counselling cou)
	{
		return repo.save(cou);
	}
	public Counselling editCounselling(Counselling cn,int SERIALNO)
	{
		Counselling ret = repo.findById(SERIALNO).orElse(null);
		if(ret!= null)
		{
			ret.setSERIALNO(cn.getSERIALNO());
			return repo.saveAndFlush(ret);
		}
		else {
			
				return null;
		}
	}
		public String deleteCounselling(int SERIALNO)
		{
			repo.deleteById(SERIALNO);
			return SERIALNO+"Deleted";
		
	}
	

	


}
