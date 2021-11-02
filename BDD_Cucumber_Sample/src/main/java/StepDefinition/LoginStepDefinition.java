package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	
	@Given("^I launch the chrome browser$")
	public void i_launch_the_chrome_browser() throws Throwable {
		System.out.println("CHROME BROWSER LAUNCHED");
	  
	}

	@When("^I enter the url \"([^\"]*)\"$")
	public void i_enter_the_url(String arg1) throws Throwable {
		
		System.out.println("ENTER THE URL");
	  
	}

	@When("^I enter the username \"([^\"]*)\"$")
	public void i_enter_the_username(String arg1) throws Throwable {
		
		System.out.println("ENTERED THE USERNAME");
	    
	}

	@When("^I enter the password \"([^\"]*)\"$")
	public void i_enter_the_password(String arg1) throws Throwable {
		System.out.println("ENTERED THE PASSWORD");
	   
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
		System.out.println("CLICKED SUBMIT");
	  
	}

	@Then("^I am logged in successfully$")
	public void i_am_logged_in_successfully() throws Throwable {
	   System.out.println("LOGGED IN SUCESSFULLY");
	}



}
