package live;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AA_TestClass extends AAA_baseClass {
     String userName = "bhupesh+rwSuperAdmin@atinatechnology.in";
     String password = "5^uJ4c@&D#9";
	
     
	B_loginPage lp;
	C_homePage hp;
	D_traslation ts;
	
	
	
	@BeforeClass 
	public void m1() throws Throwable
	{
		 
		 browserLonch();
		
		 lp = new B_loginPage(driver);
			lp.logIn(userName, password, driver);
			
			hp = new C_homePage (driver);
			ts=new D_traslation (driver);
		
	
		
		
		
		
	}
	
	
	@BeforeMethod 
	
	public void backToHome () throws Throwable
	{
		hp.backToHomePage();
	}
	
	
	@Test
	public void addTraslation () throws Throwable
	{
		System.out.println("Add Traslation");
		ts.addTraslation( driver, productNumber, count,  pName, tCat, key, en, de, ProdApplication,  tSubCat,  es, fr,  sl,  jp);
		
			
		
		
	}
	
	
	@Test
	public void checkTraslation () throws Throwable
	{
		System.out.println("Check Traslation");
	
		
		ts.checkTraslation( driver, productNumber, count,  pName, tCat, key,  en, de, ProdApplication,  tSubCat,  es,
				 fr,  sl,  jp);
			
		
		
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod 
	public void backToHomePage2() throws Throwable
	{
		hp.backToHomePage();
		
	}
	
	@AfterClass 
	public void m2() throws Throwable
	{
		lp.logOut();
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
}
