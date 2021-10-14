package com.selenium.training.steps;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DBTest {
	
	Connection connection;
	ResultSet resultSet;
	
	@When("^connection is established using")
	public void connection_is_established_using() throws ClassNotFoundException, SQLException {
	    Class.forName("org.postgresql.Driver");
	    connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","xdred","password");
	    System.out.println("connected");
	    }

	@And("I run a select query to get data")
	public void i_run_a_select_query_to_get_data() throws SQLException {
	    String query = "select * from freshproducts where product_Id = 1";
	    Statement statement = connection.createStatement();
	    resultSet = statement.executeQuery(query);
	}

	@Then("I should see the result as mouse")
	public void i_should_see_the_result_as_mouse() throws SQLException {
	    resultSet.next();
	    String result = resultSet.getString(3);
	    Assert.assertEquals("mouse", result);
	}

}
