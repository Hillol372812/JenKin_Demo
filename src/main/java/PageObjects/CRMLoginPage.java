package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMLoginPage {
	
	WebDriver driver;
	
	public CRMLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	 By Email= By.xpath("//*[@name=\"email\"]");
	 By Password= By.name("password");	 
	 By LoginButton = By.xpath("//*[text()=\"Login\"]");
	 
	 By Notification_Message = By.xpath("//*[@class=\"ui negative message\"]/div");
	 
	 By Sign=By.xpath("//*[text()=\"Sign Up\"]");
	 
	
	 
	 public WebElement EnterEmail()
	 {
		return  driver.findElement(Email);
		 
	 }
	 
	 public WebElement EnterPwd()
	 {
		 return driver.findElement(Password);
	 }
	 
	 public WebElement ClickOnLoginButton()
	 {
		 return driver.findElement(LoginButton);
	 }
	 
	  public WebElement NotificationMessage()
	  {
		  return driver.findElement(Notification_Message);
	  }
	 
	  
	  
	  public CRMRegPage ClickOnSignIn()
	  {
		  driver.findElement(Sign).click();
		  return new CRMRegPage(driver);
	  }
	 
}
