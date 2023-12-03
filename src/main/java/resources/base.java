package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	
	
	
	public WebDriver initializedriver() throws IOException {
		
		 prop = new Properties();
		 
		
		FileInputStream fis = new FileInputStream(
				//"E:\\Desktop\\Selenium WorkSpace\\E2E\\src\\main\\java\\Data.properties"
				System.getProperty("user.dir")+"\\src\\main\\java\\Data.properties");
		prop.load(fis);
		//String BrowserName = prop.getProperty("browsername");
		
		String BrowserName =System.getProperty("browsername");
		
		System.out.println("Browser selected :"+BrowserName);
		if(BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Hillol\\Desktop\\Eclipse\\Chrome driver\\Updated_81\\chromedriver.exe");
			driver = new ChromeDriver();		
		} else if (BrowserName.equals("Firefox")) {
			
			System.out.println("Invoke FirefoxDriver......");
			
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		System.out.println("Initialized :"+BrowserName);

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		return driver;
		
		
	}
	
	public String getScreenshotpath(String Testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot TS=(TakesScreenshot)driver;
		File source=TS.getScreenshotAs(OutputType.FILE);
		String Destination=System.getProperty("user.dir")+"//reports//"+Testcasename+".png";
		Files.copy(source,new File(Destination));
		return Destination;
		
	}

}
