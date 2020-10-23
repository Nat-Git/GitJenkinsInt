package retailPSA.RetailMaven;

import static org.testng.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import lib.RetailExcelDataConfig;

//import PSA_RetailMaven.PSARetailMaven.RetailLocators;

public class RetailMethods {

	
	
	//String ExcelPath = "C:\\Windows 10 System\\Test Data\\PSA Retail data.xlsx";
	
	String ExcelPath = "\\test-output\\Test Data\\PSA Retail data.xlsx";
	RetailExcelDataConfig excelObj = new RetailExcelDataConfig(ExcelPath);
	
	String ScreenshotPath = "\\test-output\\Failed Screenshots\\";
	String deleteScreenshots = "\\test-output\\Failed Screenshots\\";
	
	public void login(WebDriver driver) throws InterruptedException, IllegalFormatException, IOException
	{
		
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		

		String url = excelObj.getData("Application login", 1 , 0);
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RetailLocators.acceptCookies(driver).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Boolean status = RetailLocators.myAMIOrangeText(driver).isDisplayed();
		//assert(false);
		
		
		if(status == true)
		{
			Reporter.log("User logged in successfully");
		}
		
		else
		{
			
			assertFalse(true, "Login failed");
			
		}
		
	}
		
	
		
		//Adding 2 year services 
		
		public void addServiceMyAMIOrange(WebDriver driver) throws InterruptedException
		{
			
			String name = new Object(){}.getClass().getEnclosingMethod().getName();
			
				//RetailLocators.myAMIPopIcon(driver).click();
				//Boolean AmiPop = RetailLocators.verifyMyAMIPop(driver).isDisplayed();
				Boolean AmiOrange = RetailLocators.verifyMyAMIOrange(driver).isDisplayed();
				
				if (AmiOrange == true)
				{
					System.out.println("My AMI Orange car model which is displayed is correct");
					
					RetailLocators.toggleButton(driver).click();
					RetailLocators.servicesArrowdown(driver).click();
					RetailLocators.year2Care(driver).click();
					JavascriptExecutor js=((JavascriptExecutor)driver);
					js.executeScript("scroll(0,350)");
					RetailLocators.iAddItButton(driver).click();
					js.executeScript("scroll(0,350)");
					RetailLocators.iValidButton(driver);
					
					
					//Adding verification
					//String AddedCarModel = RetailLocators.verifyAMIPopAfterAdding(driver).getText();
					
					String AddedCarModel = RetailLocators.verifyAMIOrangeAfterAdding(driver).getText();
					
					String ExpectedCarModel = "MY AMI ORANGE";
					
					if (AddedCarModel.equals(ExpectedCarModel)) {
						
						System.out.println("My AMI Orange car model which was added in basket is correct");
					} else {

						//System.out.println("My AMI Pop car model which was added in basket is wrong");
						assertFalse(true, "My AMI Orange car model which was added in basket is wrong");
						
					}
				
						js.executeScript("window.scrollBy(0,1000)");
						RetailLocators.iValidateMyBasketButton(driver).click();
						//Thread.sleep(1000);
						//js.executeScript("scroll(0,650)");
						js.executeScript("window.scrollBy(350,0)");
						Thread.sleep(2000);
						RetailLocators.homeDeliveryButton(driver);
						Thread.sleep(2000);
						js.executeScript("scroll(0,650)");
						RetailLocators.JeContinueButton(driver).click();
						RetailLocators.JeContinueConfirmButton(driver).click();
						RetailLocators.SECONNECTERButton(driver).click();
						Thread.sleep(2000);
						Boolean pageTitleStatus = RetailLocators.pageTitleAccountCreation(driver).isDisplayed();
						
						if (pageTitleStatus==true)
						{
							Reporter.log("Service added successfully for My AMI Pop");
						}
						
						else
						{
							assertFalse(true, "Service is not added for My AMI Pop");
						}
			   }
	
					
			}
			
			
		
		//User Login
		public void accountLogin(WebDriver driver) throws InterruptedException
		{
			
			String emailid =excelObj.getData("Account creation", 1, 0);
			String pwd = excelObj.getData("Account creation", 1, 1);
			
			RetailLocators.emailTextBox(driver).sendKeys(emailid);
			RetailLocators.passwordTextBox(driver).sendKeys(pwd);
			RetailLocators.valider(driver).click();
			//Thread.sleep(2000);
			Boolean personnelDetails = RetailLocators.myPersonnelInfo(driver).isDisplayed();
			if(personnelDetails == true)
			{
				Reporter.log("User login is done successfully");

			}
			else
			{
				assertFalse(true, "User is unable to login");
			}
			
			
		}

		public void basketVerification(WebDriver driver) throws InterruptedException
		{
			
			//Boolean ImageDisplay = RetailLocators.AMIPopBasketVerification(driver).isDisplayed();
			
			Boolean ImageDisplay = RetailLocators.AMIOrangeBasketVerification(driver).isDisplayed();
			
			if(ImageDisplay==true)
			{
				Reporter.log("Basket contains correct Car Model");
			}
			
			else
			{
				assertFalse(true, "Basket contains wrong Car Model");
			}
			
			Thread.sleep(1000);
			RetailLocators.contactTextBasketVerification(driver);
			RetailLocators.basketAddressVerification(driver);
			
			Thread.sleep(1000);
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("window.scrollBy(0,450)");
			Thread.sleep(1000);
			RetailLocators.BasketJeContinue(driver);
			
			
			RetailLocators.RadioButtonChargeSeulImmatriculation(driver);
			js.executeScript("window.scrollBy(0,100)");
			RetailLocators.ImmatriculationJeContinue(driver);
			RetailLocators.buttonJeConfirme(driver);
			Thread.sleep(3000);
			
		}

		
		//Verifying Check boxes 
		public void checkBoxVerification_Cash(WebDriver driver) throws InterruptedException
		{
			System.out.println();
			
			WebElement element = RetailLocators.CheckBox3(driver);
			Thread.sleep(2000);
			
           JavascriptExecutor js= (JavascriptExecutor) driver;
           
			js.executeScript("window.scrollBy(0,650)");
           
			//js.executeScript("arguments[0].scrollIntoView();",element );
           
			Thread.sleep(2000);
			
			
			
			Boolean ChkBox1Availability = RetailLocators.CheckBox1(driver).isDisplayed();
			
			Boolean ChkBox2Availability = RetailLocators.CheckBox2(driver).isDisplayed();
			
			Boolean ChkBox3Availability = RetailLocators.CheckBox3(driver).isDisplayed();
			
			if((ChkBox1Availability == true))
			{
				RetailLocators.CheckBox1CashCondition(driver);	
			}
			
			
			if(ChkBox2Availability == true)
			{
				RetailLocators.CheckBox2CashService(driver);
			}
			
			
			if(ChkBox3Availability == true)
			{
				RetailLocators.CheckBox3Consent(driver);
			}
			
			else 
			{
				assertFalse(true, "Checkbox is missing");
				
			}
			
			
			Boolean PaymentContinueBtn = RetailLocators.jeContinuePaiementButton(driver).isEnabled();
			if(PaymentContinueBtn == true)
			{
			  RetailLocators.jeContinuePaiementButton(driver).click();
			}
			
			else 
			{
				assertFalse(true, "Payment Continue button is  disabled");
			}
			
		}
			
		
		//Payment method
		public void paymentPageVerification(WebDriver driver) throws InterruptedException
		{
			
			Boolean MasterCardAvailability = RetailLocators.masterCardValidation(driver).isDisplayed();
			
			if(MasterCardAvailability == true)
			{
				System.out.println("Mastercard is getting displayed");
				WebElement frame1 = RetailLocators.iFrameCardNumber(driver);
				
				WebElement frame2 = RetailLocators.iFrameExpiryDate(driver);
				
				WebElement frame3 = RetailLocators.iFrameCVC(driver);
				
				String cardNumber = excelObj.getData("Card details", 1, 0);
				String CardExpiry = excelObj.getData("Card details", 1, 1);
				String cvc = excelObj.getData("Card details", 1, 2);
				
				driver.switchTo().frame(frame1);

				RetailLocators.cardNumberInputField(driver).sendKeys(cardNumber);
				//Thread.sleep(1000);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(frame2);
				//Thread.sleep(1000);

				RetailLocators.cardDateExpiration(driver).sendKeys(CardExpiry);
				//Thread.sleep(1000);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(frame3);
				//Thread.sleep(1000);

				RetailLocators.cryptogrammeField(driver).sendKeys(cvc);
				
				
				driver.switchTo().defaultContent();
				//Thread.sleep(1000);
				
				RetailLocators.submitButtonPayment(driver).click();
		
		           
			}
			    Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
				//Thread.sleep(2000);
				
				WebElement SubmitButton = RetailLocators.submitPaymentPage(driver);
				Boolean ButtonStatus = SubmitButton.isDisplayed();
				if(ButtonStatus == true)
				{
					SubmitButton.click();
				}
				
				else
				{
					assertFalse(true, "Submit button can not be clicked");
				}
				
                
				//Thread.sleep(4000);
				
				String ConfirmationText = RetailLocators.paymentMadeConfirmation(driver).getText();
				System.out.println("Actual Confirmation text is "+ConfirmationText);
				
				String expectedConfirmationText = "paiement acompte effectué";
				
				if (ConfirmationText.equalsIgnoreCase(expectedConfirmationText))
				{
					Reporter.log("Payment done successfully");
				}
				
				else
				{
					assertFalse(true, "Payment can not be done");
					
				}
				
		}				
			

	
		 //getting screenshots
	   	public void getScreenshot(WebDriver driver, String name) throws Exception 
	      { 
	   		  TakesScreenshot ts=((TakesScreenshot)driver);
	   		  File source=ts.getScreenshotAs(OutputType.FILE);
	   		  String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	   		  FileUtils.copyFile(source, new File((System.getProperty("user.dir")+ScreenshotPath)+name+timestamp+".png")); 
	   		  System.out.println("Screenshot taken");    		  
	   	}
	   	
	   	
	   	public void delete()
		{
			File file=new File(System.getProperty("user.dir")+deleteScreenshots);
			File[] files=file.listFiles();
			for(File f:files)
			{
				if(f.isFile()&&f.exists())
				{
					f.delete();
				}
				else
					System.out.println("Cannot delete file from folder");
			}
		}
	   	
	       
	   	
	       
	       
	       public void closeBrowser(WebDriver driver) throws InterruptedException
	       {
	          driver.close();
	       }
	
	
	
}
