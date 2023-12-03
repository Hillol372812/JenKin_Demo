package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.base;

public class Homepage extends base {

	
	
	@Given("User initialize the browser")
	public void user_initialize_the_browser() throws IOException
	{
	   
		 System.out.println("User initialize the browser"); 
		 driver = initializedriver();
			driver.get("https://www.amazon.in/");
			
	}

	@When("^user in HomePage Page$")
	public void user_in_HomePage_Page()
	{
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
		 System.out.println("user in HomePage Page");
	}

	@When("^Navigate to MobilesPage and click on link$")
	public void Navigate_to_MobilesPage_and_click_on_link()
	{
		 System.out.println("Navigate to MobilesPage and click on link");
	}

	@When("^Navigate to ShopByBrand page and click$") 
	
	public void Navigate_to_ShopByBrand_page_and_click()
	{
		 System.out.println("Navigate to ShopByBrand page and click");
	}

	@When("^User navigate to ShopByBrandNokiaLink page and select the color$")
	
	public void User_navigate_to_ShopByBrandNokiaLink_page_and_select_the_color()
	{
	    
		 System.out.println("User navigate to ShopByBrandNokiaLink page and select the color");
	}

	@Then("^Title of the page is \"([^\"]*)\"$") 
	
	public void title_of_the_page_is_something(String strArg1) throws Throwable {
        
	    
	   System.out.println("Title of the page :"+strArg1);
	   
	   driver.close();
	}
	
	@AfterMethod
	
	public void TearDown()
	{
		driver.close();
		
		System.out.println("Driver Close...");
		
	}
	
	
	

}
