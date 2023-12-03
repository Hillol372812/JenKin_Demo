package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMSignUpPage {
	
	WebDriver driver;
	
	public  CRMSignUpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By SignupLink = By.xpath("//*[text()=\"Sign Up\"]");
	 
	
	 public CRMLoginPage Click_On_Signup_Link()
	 {
		 driver.findElement(SignupLink).click();
		 return new  CRMLoginPage(driver);
	 }
	 
	 public WebElement CRMButton()
	 {
		 
		 return driver.findElement(SignupLink);
	 }
	
	 
}
