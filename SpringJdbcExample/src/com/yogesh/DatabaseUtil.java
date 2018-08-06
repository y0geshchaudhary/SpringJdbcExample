package com.yogesh;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*@Component*/
public class DatabaseUtil {

	private DataSource dataSource;
	
	/*@Autowired*/
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void createTable()
	{
		try {
			Connection connection= dataSource.getConnection();
			Statement statement= connection.createStatement();
			statement.execute("Create table PERSON (NAME varchar(20) NOT NULL,  EMAIL varchar(20));");
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
