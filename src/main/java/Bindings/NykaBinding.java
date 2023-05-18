package Bindings;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaHomePage;

public class NykaBinding {
	
	public String searchData="Lipstick";
	
	@Given("I am from Nyka page Scenarios")
	public void i_am_from_nyka_page_scenarios() throws Throwable {
        System.out.println("From nyka feature background");
    }
	
	

	 @Given("^I launch the application$")
	    public void i_launch_the_application() throws Throwable {
	        
	    }

	    @When("^I clicked on search area$")
	    public void i_clicked_on_search_area() throws Throwable {
	    	NykaHomePage.clickAndEnterTextInSearchArea(searchData);
	        
	    }

	    @Then("^I verified that search result$")
	    public void i_verified_that_search_result() throws Throwable {
	        
	    }

	    @And("^I entered the product name$")
	    public void i_entered_the_product_name() throws Throwable {
	        
	    }

	    @And("^I selected the data from the suggestions$")
	    public void i_selected_the_data_from_the_suggestions() throws Throwable {
	        
	    }

}
