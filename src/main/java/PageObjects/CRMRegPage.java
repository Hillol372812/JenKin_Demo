package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMRegPage {
	
	WebDriver driver;
	
	public CRMRegPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	
	 By ClickCheckBox =By.cssSelector( "#terms");
	 
	 public WebElement ClickCheckbox()
	 {
		 return driver.findElement(ClickCheckBox);
	 }
	

}
