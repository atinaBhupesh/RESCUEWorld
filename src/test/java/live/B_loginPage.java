package live;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class B_loginPage extends AAA_baseClass {
	
	@FindBy(xpath="//input[@id=\"email\"]")private WebElement userNameField  ;
	@FindBy(xpath="//input[@id=\"password-input\"]")private WebElement passwordField;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement logInButton;
	@FindBy(xpath="//i[@class=\"bx bx-cog fs-28\"]")private WebElement setting;
	 @FindBy(xpath="//a[@class=\"txt-link d-wrap\" and @href=\"javascript:void(0)\"]")private WebElement logOut;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	 
	 
	
	
	
	public B_loginPage (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logIn(String userName, String password, WebDriver driver) throws Throwable {
		Actions act = new Actions(driver);
		
		
		userNameField.click();
		act.sendKeys(userName).build().perform();
//		Thread.sleep(3000);

		passwordField.click();

		act.sendKeys(password).build().perform();
		
		Thread.sleep(2000);
		logInButton.click();
//		Thread.sleep(3000);
	
	}
	
	
	
	
	public void logOut () throws Throwable
	{
		setting.click();
		Thread.sleep(2000);
		logOut.click();
		Reporter.log("logout successfully. ", true);
		
	
		
		
	}
	

}
