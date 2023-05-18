package Bindings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static String URL = "https://www.nykaa.com/";
	public static WebDriver driver;
	public static Actions act;
	public static WebDriverWait wait;

//	@Before
//	public static void Start() {
//		// Launch the Application in Chrome
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(URL);
//		System.out.println("From hooks start");
//	}
//   @After
//	public static void End() {
//		driver.quit();
//		System.out.println("From hooks end");
//
//	}

}
