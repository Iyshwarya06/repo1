package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bindings.Hooks;
import nykabaseActions.PageActions;

public class NykaHomePage extends Hooks {
	//Locator
	public static WebElement SearchArea=driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
	//Related Actions
	public static void clickAndEnterTextInSearchArea(String dataForSearch)
	{
		PageActions.clickOnElement(SearchArea);
		PageActions.EnterText(SearchArea, dataForSearch);
	}
	

}
