package org.datatable2;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTables {
	
	
	@Given("user gives the datatable")
	public void user_gives_the_datatable() {
System.out.println("Datatable");
	}

	@When("one dimension without header")
	public void one_dimension_without_header(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("One dimension without header");
	    List<String> asList = dataTable.asList();
	    System.out.println(asList.get(0));
	    System.out.println(asList.get(1));
	    System.out.println(asList.get(2));
	    System.out.println("-------------------------");
	    
	    
	}

	@And("one dimension with header")
	public void one_dimension_with_header(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("One Dimension with header");
	    dataTable.asMap(String.class, valueType)
	}

	@And("Two Dimension with header")
	public void two_Dimension_with_header(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@And("Two Dimension without header")
	public void two_Dimension_without_header(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@Then("Datatable is over")
	public void datatable_is_over() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}




}
