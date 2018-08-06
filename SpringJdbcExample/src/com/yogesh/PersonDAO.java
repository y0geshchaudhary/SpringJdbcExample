package com.yogesh;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insert(PersonDTO person)
	{
		String sql= "insert into PERSON(NAME,EMAIL) values (?,?);";
		String name= person.getName();
		/*String email= person.getEmail();*/
		
		getJdbcTemplate().update(sql, new Object[]{name/*,email*/});
		
	}
	
	public List<PersonDTO> listAll()
	{
		
		List<PersonDTO> list= getJdbcTemplate().query("select * from PERSON", new PersonRowMapper());
		
		System.out.println(list.size());
		
		return list;
	}
}
