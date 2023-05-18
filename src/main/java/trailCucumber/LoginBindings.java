package trailCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBindings {
	public static String URL = "https://www.letcode.in/";
	public static WebDriver driver;

	@Given("Launch the Application")
	public void launch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}

	@When("I entered the username")
	public void i_entered_the_username() {

		
	}

	@When("I enetered password")
	public void i_enetered_password() {

		
	}

	@When("I clicked on login button")
	public void i_clicked_on_login_button() {

		
	}

	@Then("I verified that user got logged in successfully")
	public void i_verified_that_user_got_logged_in_successfully() {

		
	}

}
