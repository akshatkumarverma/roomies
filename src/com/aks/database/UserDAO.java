package com.aks.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.aks.beans.UserDetails;

public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<UserDetails> getTotalNumberOfUsers() {
		String countQuery = "SELECT * from USER_DETAILS";
		List<UserDetails> userDetailsList = jdbcTemplate.query(countQuery, new RowMapper<UserDetails>() {
			@Override
			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDetails userDetails = new UserDetails();
				userDetails.setUname(rs.getString("user_name"));
				userDetails.setPassword(rs.getString("user_password"));
				return userDetails;
			}
		}); 
		
		for(UserDetails user : userDetailsList){
			System.out.println(user);
		}
		return userDetailsList;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
