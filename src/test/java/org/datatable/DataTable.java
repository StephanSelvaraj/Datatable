package org.datatable;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable {
	
	@Given("Precondition")
	public void precondition() {
	    System.out.println("precondition");
	}

	@When("User enter the data")
	public void user_enter_the_data(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		String string = asList.get(0);
		System.out.println(string);
		String string2 = asList.get(1);
		String string3 = asList.get(2);
		
		System.out.println(string2);
		System.out.println(string3);
		
		
		
	}
	@And("check the Data")
	public void check_the_Data(io.cucumber.datatable.DataTable dataTable) {
		
		Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
		
		Object object = asMap.get("course");
		
		System.out.println(object);
	   
	}

	@Then("Validate the Data")
	public void validate_the_Data() {
	    
	}




}
