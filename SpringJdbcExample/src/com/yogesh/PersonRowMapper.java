package com.yogesh;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/*@Component*/
public class PersonRowMapper implements RowMapper<PersonDTO>
{



	@Override
	public PersonDTO mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		PersonDTO person= new PersonDTO();
		
		person.setName(arg0.getString(1));
		//person.setEmail(arg0.getString(2));
		
		return person;
	}
	
}