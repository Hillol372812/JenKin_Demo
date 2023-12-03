package StepDefinations;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.base;

public class CRMSignUpTest extends base {
	
	

@Given("Launch the Browser")
public void launch_the_browser() throws IOException {
	 
	 driver = initializedriver();
    System.out.println("Browser Launch SuccessFully.,.");
    driver.get(prop.getProperty("url"));
}

@Given("Verify SignIn link")
public void verify_sign_in_link() {
	
	driver.close();
	
  System.out.println("Verify SignIn Link and driver close successfully..");
}

@When("Click on SignLink")
public void click_on_sign_link() {
	
	  System.out.println("Click on SignIn Link");
}

@Then("user Navigate to loginPage")
public void user_navigate_to_login_page() {
	
	  System.out.println("user Navigate to loginPage..");
}


@Given("Launch the Browser in prod")
public void launch_the_browser_in_prod() {
	
	 System.out.println("Launch the browser in Prod..");
    
}


}
