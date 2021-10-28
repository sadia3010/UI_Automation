package com.steps;

import com.resourses.base;
import com.testCase.TestCase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions extends base
{

	TestCase tc= new TestCase();
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable
	{
	    
	}

	@When("^URL is opened successfully$")
	public void url_is_opened_successfully() throws Throwable 
	{
	   
	}

	@Then("^verify the count of values on the screen$")
	public void verify_the_count_of_values_on_the_screen() throws Throwable 
	{
	   tc.ValidateCount(); 
	}

	@And("^verify the Total Balance is correct based on the values on the screen$")
	public void verify_the_Total_Balance_is_correct_based_on_the_values_on_the_screen() throws Throwable 
	{
	    tc.validateTotalBalance();
	}

	@And("^verify whether the values are greater than zero and are represented as Currencies$")
	public void verify_whether_the_values_are_greater_than_zero_and_are_represented_as_Currencies() throws Throwable 
	{
	    tc.validateCurrencies();
	}

	@And("^calculate the sum of values and validate the Total Balance$")
	public void calculate_the_sum_of_values_and_validate_the_Total_Balance() throws Throwable 
	{
	    tc.validateSumValues();
	}

}
