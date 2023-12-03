package StepDefinations;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.CRMLoginPage;
import PageObjects.CRMSignUpPage;
import resources.base;

public class CRMSignUpPageTest extends base {
	
	CRMSignUpPage CRMSignUp;
	
	@BeforeClass
	
	public void initializebrowser() throws IOException
	{
		
		driver =initializedriver();
		driver.get(prop.getProperty("url"));
		
		System.out.println("Browser Launch Successfully...");
	}
	
	
	@Test
	
	public void verifySignInLink()
	{
		Assert.assertTrue(CRMSignUp.CRMButton().isEnabled());
		CRMLoginPage loginpage = CRMSignUp.Click_On_Signup_Link();
		
		
	}
	
	@AfterClass
	
	public void teardown()
	{
		driver.close();
		System.out.println("Browser close successfully...");
	}
	
	
	
	
	

}
