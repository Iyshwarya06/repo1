package baseActions;

import org.openqa.selenium.By;

import Bindings.Hooks;

public class BaseActions extends Hooks {
	
	public static void click(String clickLogin)
	{
		driver.findElement(By.xpath(clickLogin)).click();
	}

}
