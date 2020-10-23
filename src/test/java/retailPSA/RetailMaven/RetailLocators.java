package retailPSA.RetailMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetailLocators {


	
	public static WebElement acceptCookies(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement cookie=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='_psaihm_cta_container']/a[1]")));
		return cookie;
	}

	public static WebElement homeTitleText(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='je suis un professionel']")));
		return text;
	}
	
	
	
	public static WebElement myAMIOrangeText(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement myAMIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/ul/li[2]/div/h2")));
		//WebElement myAMIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[contains(text(), 'MY AMI ORANGE')])[1]")));
		
		return myAMIcon;
	}
	
	
	public static WebElement myAMIPopIcon(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		//WebElement myAMIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='preconfiguration-color-4']/img")));
		WebElement myAMIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='car-PreconfigurationPicker-container']/div[1]/div[3]/div[1]/div/img")));
		return myAMIcon;
	}
	
	
	
	public static WebElement verifyMyAMIPop(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement verify = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='car-model-360-offview-P005']")));
		return verify;
	}
	
	
	public static WebElement myAMIOrangeIcon(WebDriver driver) throws InterruptedException
	{

		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement myAMIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='car-PreconfigurationPicker-container']/div[1]/div[3]/div[1]/div/img")));
		return myAMIcon;
	}
	public static WebElement verifyMyAMIOrange(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement verify = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='car-model-360-offview-P001']")));
		return verify;
	}
	
	public static WebElement toggleButton(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='price-switcher-input-toggle']/label/input")));
		return btn;
	}
	
	public static WebElement servicesArrowdown(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		//WebElement arrowdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div/div/div/div/div[2]/div[3]/div/div/div/p[1]")));
		WebElement arrowdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'services')]")));
		return arrowdown;
	}
	
	
	public static WebElement year2Care(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement arrowdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='closed-package-MY AMI CARE 2 ANS']")));
		return arrowdown;
	}
	
	
	public static WebElement iAddItButton(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-id='customize-add-package']")));
		return btn;
	}
	
	
	public static WebElement iValidButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-id='customize-order-button']")));
		Actions action = new Actions(driver);
		action.moveToElement(btn);
		Thread.sleep(1000);
		action.click();
		action.build().perform();
		
		return btn;
	}
	
	
	public static WebElement verifyAMIPopAfterAdding(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='MY AMI POP']")));
		return text;
	}
	
	
	public static WebElement verifyAMIOrangeAfterAdding(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='MY AMI ORANGE']")));
		return text;
	}
	
	//Button - "je valide mon panier"
	public static WebElement iValidateMyBasketButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-id='delivery-confirmation-continue-button']")));
		Actions action = new Actions(driver);
		action.moveToElement(btn);
		action.click();
		action.build().perform();
		return btn;
		
		
	}
	
	
	//Radio button - Livraison Ã  domicile
	public static WebElement homeDeliveryButton(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='delivery-option-container-0']/div[1]/label/div")));
		
		Actions action = new Actions(driver);
		action.moveToElement(btn);
		action.click();
		action.build().perform();
		return btn;
	}
	
	
  //Button - JE CONTINUE
	public static WebElement JeContinueButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-id='delivery-type-continue-button']")));
		Actions action = new Actions(driver);
		action.moveToElement(btn);
		action.click();
		action.build().perform();
		return btn;
	}
	
	public static WebElement JeContinueConfirmButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/button")));
		
		return btn;
	}
	
	// Button - SE CONNECTER
	
	public static WebElement SECONNECTERButton(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='basket-redirect-login-button']")));
		return btn;
	}
	
	//Page title text
	public static WebElement pageTitleAccountCreation(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page_title']/h2")));
		return btn;
	}
	
	
	//email address text box
	public static WebElement emailTextBox(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver,60);
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		return btn;
	}
	
	//password text box
		public static WebElement passwordTextBox(WebDriver driver) throws InterruptedException
		{
			//Thread.sleep(2000);
			WebDriverWait wait= new WebDriverWait(driver,60);
			WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
			return btn;
		}
	
	
		//Login button
				public static WebElement valider(WebDriver driver) throws InterruptedException
				{
					//Thread.sleep(2000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='submit']")));
					return btn;
				}
			
				
				//Address info check
				public static WebElement myPersonnelInfo(WebDriver driver) throws InterruptedException
				{
					//Thread.sleep(2000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='mes informations personnelles']")));
					return btn;
				}
				
		
		
		//basket Car image verification
				public static WebElement AMIPopBasketVerification(WebDriver driver) throws InterruptedException
				{

					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement img = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='MY AMI POP']")));
					return img;
				}
				
				
				public static WebElement AMIOrangeBasketVerification(WebDriver driver) throws InterruptedException
				{

					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement img = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='MY AMI ORANGE']")));
					return img;
				}
				
				
		//basket Contact text  verification
				public static void contactTextBasketVerification(WebDriver driver) throws InterruptedException
				{
					String ReqdText = "m. Adrien laurent Test autom 0934343434 automo2c@yopmail.com";
					Thread.sleep(1000);
					System.out.println("Contact details displayed are ");
					List<WebElement> list = driver.findElements(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div[2]/div/div[1]/ul"));
					for (WebElement ele : list)
					{
						String text = ele.getText();
						System.out.println(text);
					}

					System.out.println();
					//Assert.assertTrue("", list.size()>0);
					//ADD VERIFICATION FOR THE TEXT
				}	
				
				
				
				//basket Address verification
				public static void basketAddressVerification(WebDriver driver) throws InterruptedException
				{
					Thread.sleep(1000);
					System.out.println("Address details displayed are ");
					List<WebElement> list = driver.findElements(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div[2]/div/div[2]/ul/li"));
					for (WebElement ele : list)
					{
						String text = ele.getText();
						System.out.println(text);
						
					}
					
					System.out.println();

					//Assert.assertTrue("", list.size()>0);
					//ADD VERIFICATION FOR THE TEXT
				}	
				
				
				
		
				//basket verification continue button
				public static WebElement BasketJeContinue(WebDriver driver) throws InterruptedException
				{
					Thread.sleep(2000);
				
					WebDriverWait wait= new WebDriverWait(driver,60);
					//WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div[2]/div/button")));
					
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='my-details-continue']")));
					Thread.sleep(2000);
					Actions action = new Actions(driver);
					action.moveToElement(btn).click().build().perform();
					
					return btn;
				}

				
				
				//Radio button - I take care of Registration alone
				public static WebElement RadioButtonChargeSeulImmatriculation(WebDriver driver) throws InterruptedException
				{
					Thread.sleep(2000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[4]/div[2]/div/label[2]/div")));
					
					Actions action = new Actions(driver);
					action.moveToElement(btn);
					Thread.sleep(1000);
					action.click();
					action.build().perform();
					return btn;
				}
				
				
				//Registration continue button
				public static WebElement ImmatriculationJeContinue(WebDriver driver) throws InterruptedException
				{
					Thread.sleep(1000);
				
					WebDriverWait wait= new WebDriverWait(driver,60);
					//WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='basket-registration-vehicle-continue-button']")));
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-id='basket-registration-vehicle-continue-button']")));
					
					//Thread.sleep(2000);
					Actions action = new Actions(driver);
					action.moveToElement(btn).click().build().perform();
					return btn;
				}
				
				public static WebElement buttonJeConfirme(WebDriver driver) throws InterruptedException
				{
					Thread.sleep(2000);
				
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='je confirme']")));
					Thread.sleep(2000);
					Actions action = new Actions(driver);
					action.moveToElement(btn).click().build().perform();
					return btn;
				}
				
				
				
				public static WebElement CheckBox1CashCondition(WebDriver driver) throws InterruptedException
				{
					//Thread.sleep(2000);
				
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div[3]/div[6]/div[1]/div[1]/label[1]")));
					//Thread.sleep(2000);
					Actions action = new Actions(driver);
					action.moveToElement(btn);
					Thread.sleep(1000);
					action.click();
					action.build().perform();
					return btn;
				}


				public static WebElement CheckBox2CashService(WebDriver driver) throws InterruptedException
				{
					//Thread.sleep(2000);
				
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div[3]/div[6]/div[1]/div[2]/label")));
					//Thread.sleep(2000);
					Actions action = new Actions(driver);
					action.moveToElement(btn);
					Thread.sleep(1000);
					action.click();
					action.build().perform();
					return btn;
				}
				
				
				public static WebElement CheckBox3Consent(WebDriver driver) throws InterruptedException
				{

				
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div[3]/div[6]/div[1]/label")));

					Actions action = new Actions(driver);
					action.moveToElement(btn).click().build().perform();
					return btn;
				}
				
				
				public static WebElement CheckBox1(WebDriver driver) throws InterruptedException
				{

					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div[3]/div[6]/div[1]/div[1]/label[1]")));
					return btn;
				}
				
				public static WebElement CheckBox2(WebDriver driver) throws InterruptedException
				{


					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div[3]/div[6]/div[1]/div[2]/label")));
					return btn;
				}
				
				public static WebElement CheckBox3(WebDriver driver) throws InterruptedException
				{


					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div/div[2]/div/div/div[3]/div[6]/div[1]/label")));
					return btn;
				}
				
				
				// je continue vers le paiement button
				public static WebElement jeContinuePaiementButton(WebDriver driver) throws InterruptedException
				{
					//Thread.sleep(2000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='my-order-summary-to-pay-link']")));
					return btn;
				}
				
				public static WebElement masterCardValidation(WebDriver driver) throws InterruptedException
				{
					//Thread.sleep(2000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='payment-product-switcher-container']/div/div/label[1]/i")));
					return btn;
				}
				
				
				public static WebElement cardNumberInputField(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement field = wait.until(ExpectedConditions.elementToBeClickable(By.name("cardnumber")));
					field.clear();
					field.click();
					return field;
				}
				
				
				public static WebElement iFrameCardNumber(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					//WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-hipay-id='hostedfield-iframe']")));
					WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'hipay-hosted-cardNumber')]")));
					return frame;
				}
				
				public static WebElement iFrameExpiryDate(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'hipay-hosted-expiryDate')]")));
					return frame;
				}
				
				public static WebElement iFrameCVC(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'hipay-hosted-cvc')]")));
					return frame;
				}
				
				
				
				public static WebElement cardDateExpiration(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					//WebElement field = wait.until(ExpectedConditions.elementToBeClickable(By.name("cc-exp")));
					WebElement field1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/input")));
					
					Actions action = new Actions(driver);
					action.moveToElement(field1);
					action.click();
					
					action.build().perform();
					return field1;
				}
				
				public static WebElement cryptogrammeField(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement field = wait.until(ExpectedConditions.elementToBeClickable(By.name("cvc")));
					field.click();
					field.clear();
					
					return field;
				}
				
				public static WebElement submitButtonPayment(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submit-button']")));
					return btn;
				}
				
				
				
				public static WebElement submitPaymentPage(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					//WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id='Submit']")));
					//WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@method='post']/div[9]/div/input")));
					
					WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@method='post']/div[9]/div/input")));
					return btn;
				}
				
				
				public static WebElement paymentMadeConfirmation(WebDriver driver) throws InterruptedException
				{

					//Thread.sleep(1000);
					WebDriverWait wait= new WebDriverWait(driver,60);
					WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='paiement acompte effectué']")));
					return text;
				}
				

	
	
	
	
}
