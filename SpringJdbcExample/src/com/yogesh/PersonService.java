package com.yogesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {

	private PersonDAO personDAO;

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	@Autowired
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void addPerson(PersonDTO person)
	{
		getPersonDAO().insert(person);
		
	}
	
	public List<PersonDTO> getAllPerson()
	{
		return getPersonDAO().listAll();
	}
	
}
