package com.techelevator.dao;

import com.techelevator.dao.model.Customer;
import com.techelevator.dao.model.Film;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import javax.sql.rowset.Joinable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
        List<Customer> matchingCustomers = new ArrayList<>();
        String customerSearchSql = "SELECT last_name, first_name, email, active FROM customer " + 
       	"WHERE customer.first_name ILIKE ? OR customer.last_name ILIKE ? ORDER BY " + sort;
        SqlRowSet results = jdbcTemplate.queryForRowSet(customerSearchSql, "%"+search+"%","%"+search+"%");
        while(results.next()) {
        	matchingCustomers.add(mapRowToCustomers(results));
        }
        return matchingCustomers;
	}

	private Customer mapRowToCustomers(SqlRowSet results) {
		Customer customerRow = new Customer();
		customerRow.setFirstName(results.getString("first_name"));
		customerRow.setLastName(results.getString("last_name"));
		customerRow.setEmail(results.getString("email"));
		customerRow.setActive(results.getBoolean("active"));

		return customerRow;
	}

    
}