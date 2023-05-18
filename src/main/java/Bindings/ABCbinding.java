package Bindings;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ABCbinding {
	@Given("I am A")
	public void i_am_a(DataTable datatable) {
		List<List<String>> data=datatable.asLists(String.class);
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(1).get(0));
		
	}

	@Given("I am {string}")
	public void i_am(String string) {
		System.out.println(string);
	}

	@When("^I do B$")
	public void i_do_b() throws Throwable {
		System.out.println("B");
	}

	@Then("^I get C$")
	public void i_get_c() throws Throwable {
		System.out.println("C");
	}

}
