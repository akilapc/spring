package com.spring.EngineeringCounsellingVacancyList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.EngineeringCounsellingVacancyList.model.Counselling;

@Repository
public interface EngineeringCounsellingVacancyListRepository extends JpaRepository<Counselling, Integer> {

}
