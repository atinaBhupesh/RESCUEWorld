package live;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_homePage extends AAA_baseClass{
	
	
	@FindBy(xpath="(//img[@src=\"assets/images/rescue-world-logo.png\"])[2]")private WebElement logo;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		
		
		
		public C_homePage (WebDriver driver)
		
		{
			PageFactory.initElements(driver, this);
		}
		
		public void backToHomePage() throws Throwable
		{
			logo.click();
			
			Thread.sleep(2000);
		}

}
