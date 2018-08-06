package com.yogesh.roomTypeChangeDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class SpecialReqDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	public List<SpecialRequestDto> getDtoList()
	{
		
		Object[] obj = new Object[10];
		
		List roomList = new ArrayList();
		
		roomList.add("201");
		roomList.add("202");
		roomList.add("203");
		roomList.add("204");
		roomList.add("205");
		roomList.add("206");
		roomList.add("207");
		roomList.add("208");
		roomList.add("209");
		roomList.add("210");
		
		for(int i=0;i<10;i++)
		{
			System.out.println(roomList.get(i));
			obj[i]=roomList.get(i);
		}
		
		String query = "select rf.room_id, sr.special_request_code from room_feature rf JOIN special_request sr ON "
				+ "rf.special_request_id= sr.special_request_id where rf.room_id IN (?,?,?,?,?,?,?,?,?,?);";
		
		
		return getJdbcTemplate().query(query,obj,new SpecialRequestRowMapper());
		
	}
	
	
	
}
