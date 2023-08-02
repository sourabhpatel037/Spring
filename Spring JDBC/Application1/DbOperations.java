package com.naresh.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DbOperations {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addspringdb() {
		String query = "insert into springdb values(102,'Dilip',30)";
		return jdbcTemplate.update(query);
	}

	public int deletespringdb() {
		String query = "delete  from springdb where sid=104";
		return jdbcTemplate.update(query);
	}


}
