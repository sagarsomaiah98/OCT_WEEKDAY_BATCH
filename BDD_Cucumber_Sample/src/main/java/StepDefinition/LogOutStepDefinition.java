package StepDefinition;

import cucumber.api.java.en.Then;

public class LogOutStepDefinition {
	
	@Then("^I click menu$")
	public void i_click_menu() throws Throwable {
		
		System.out.println("CLICKED MENU");
	   
	}

	@Then("^I click logout$")
	public void i_click_logout() throws Throwable {
		System.out.println("CLICKED LOGOUT BUTTON");
	   
	}

	@Then("^I am logged out of the application$")
	public void i_am_logged_out_of_the_application() throws Throwable {
		System.out.println("LOGGED OUT OF THE APPLICATION");
	  
	}



}
