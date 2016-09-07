package com.org.modal.FilterPattern;

import java.util.List;

public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		// TODO Auto-generated constructor stub
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaPersons=criteria.meetCriteria(persons);		
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
