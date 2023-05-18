package nykabaseActions;

import org.openqa.selenium.WebElement;

import Bindings.Hooks;

public class PageActions extends Hooks{
	//click
	public static void clickOnElement(WebElement ele)
	{
		ele.click();
	}
	
	//sendkeys
	public static void EnterText(WebElement ele,String text)
	{
		ele.sendKeys(text);
	}

}
