package Bindings;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaBrandBindings {
	


	@Given("^I launched the application$")
	public void i_launched_the_application() throws Throwable {
		System.out.println("I launched the application");
	}

	@When("^I hovered over the brands tab$")
	public void i_hovered_over_the_brands_tab() throws Throwable {
		System.out.println("I hovered over the brands tab");
	}

	@Then("^I verified that brandname got selected successfully$")
	public void i_verified_that_brandname_got_selected_successfully() throws Throwable {
		System.out.println("I verified that brandname got selected successfully");
	}

	@And("^I searched for ar valid Brand name$")
    public void i_searched_for_ar_valid_brand_name() throws Throwable {
		System.out.println("I searched for ar valid Brand name");

	}
	@Given("Hello from background")
	public void hello_from_background() {
	System.out.println("background");
	}
}
