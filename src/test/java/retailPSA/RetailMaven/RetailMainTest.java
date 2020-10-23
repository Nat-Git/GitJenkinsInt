package retailPSA.RetailMaven;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import PSA_RetailMaven.PSARetailMaven.RetailMethods;



//@Listeners(retailPSA.RetailMaven.ListenerTest.class)

public class RetailMainTest {

	
	WebDriver driver;
	RetailMethods obj = new RetailMethods();
	String reportPath = System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) throws Exception
	{
		
		//Check if parameter passed from TestNG is 'firefox'
				if(browser.equalsIgnoreCase("firefox")){
					//set path to chromedriver.exe
					String FirefoxPath = "\\test-output\\Driver exe\\geckodriver.exe";
				//create firefox instance
					System.setProperty("webdriver.gecko.driver",  (System.getProperty("user.dir")+FirefoxPath));
					//Set Firefox options
					 FirefoxOptions options = new FirefoxOptions();
					 options.setAcceptInsecureCerts(true); 
					driver = new FirefoxDriver(options);
					 driver.manage().window().maximize();
			
				}
				//Check if parameter passed as 'chrome'
				else if(browser.equalsIgnoreCase("chrome")){
					//set path to chromedriver.exe
					String ChromePath = "\\test-output\\Driver exe\\chromedriver.exe";
					 System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+ChromePath));
					 //Set Chrome options
					 ChromeOptions options = new ChromeOptions();
						options.setExperimentalOption("useAutomationExtension", false);
						options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
					//create chrome instance
					  driver= new ChromeDriver(options);
					    driver.manage().window().maximize();
					    driver.manage().deleteAllCookies();
				}
				//Check if parameter passed as 'Edge'
						else if(browser.equalsIgnoreCase("Edge")){
							//set path to Edge.exe
							String EdgePath = "\\test-output\\Driver exe\\msedgedriver2.exe";
							System.setProperty("webdriver.edge.driver",(System.getProperty("user.dir")+EdgePath));
						
			                 driver = new EdgeDriver();
							 driver.manage().window().maximize();
						}
				//Check if parameter passed as 'Internet Explorer'
						else if(browser.equalsIgnoreCase("IE")){
							//set path to IE.exe
							String IEPath = "\\test-output\\Driver exe\\IEDriverServer.exe";
							System.setProperty("webdriver.ie.driver",(System.getProperty("user.dir")+IEPath));
							 DesiredCapabilities capabilities = new DesiredCapabilities();
							    capabilities.setCapability("requireWindowFocus", true);
							    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
							   capabilities.setCapability("disable-popup-blocking", true);
							   capabilities.setCapability("ignoreProtectedModeSettings", true);
							    capabilities.setCapability("ignoreZoomSetting", true);
							    InternetExplorerOptions options = new InternetExplorerOptions();
							
							   options.merge(capabilities);
							//create IE instance
							driver = new InternetExplorerDriver(options);
						}
				
						else if(browser.equalsIgnoreCase("Opera")) {
							//set path to Opera.exe
							String IEPath = "\\test-output\\Driver exe\\operadriver.exe";
							System.setProperty("webdriver.opera.driver",(System.getProperty("user.dir")+IEPath));
							driver = new OperaDriver();
							driver.manage().window().maximize();
						}
					
				
				else{
					//If no browser passed throw exception
					throw new Exception("Browser is not correct");
				}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
	
	
	
	@Test(priority = 1, description = "Test Case : Verify login functionality", enabled = true)
	public void BrowserLaunch_and_UserLogin() throws IllegalFormatException, InterruptedException, IOException
	{
		obj.delete();
		obj.login(driver);
		
	}
	
	
	@Test(priority = 2, description = "Test Case : Add AMI Pop 2 year service", enabled = true)
	public void addAMIPop2YearService() throws IllegalFormatException, InterruptedException, IOException
	{
		obj.addServiceMyAMIOrange(driver);
	}
	
	
	@Test(priority = 3, description = "Test Case : Create account", enabled = true)
	public void userAccountCreation() throws IllegalFormatException, InterruptedException, IOException
	{
		obj.accountLogin(driver);
	}

	
	@Test(priority = 4, description = "Test Case: Verify items in basket", enabled = true)
	public void cartVerification() throws InterruptedException 
	{
		obj.basketVerification(driver);
		obj.checkBoxVerification_Cash(driver);
	}
	
	
	@Test(priority = 5, description = "Test Case: Payment process", enabled = true)
	public void paymentProcess() throws InterruptedException 
	{
		obj.paymentPageVerification(driver);
	}

	
	@Test(priority = 6, description = "Test Case: Closing browser", enabled=true)
	public void closeBrowser() throws InterruptedException
	 {
		driver.get((reportPath+"\\Sol O2C Test Execution Report.html"));

	 }
	
	@AfterMethod
	public void tearDown(ITestResult Result) throws Exception
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			obj.getScreenshot(driver, Result.getName());
		}
	}
	
	
}
