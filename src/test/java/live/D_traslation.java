package live;



import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.SkipException;

public class D_traslation extends AAA_baseClass {
	
	
	
	@FindBy(xpath="//span[text()=\" Translation \"]")private WebElement traslation;
	@FindBy(xpath="//i[@class=\"ri-add-fill pointer\"]")private WebElement addTraslation;
	@FindBy(xpath="//select[@id=\"product-input\"]")private WebElement selectProduct;
	 @FindBy(xpath="//select[@id=\"category-input\"]")private WebElement traslationCategory;
	 
	@FindBy(xpath="//input[@id=\"key-Input\"]")private WebElement traslationKey;
	@FindBy(xpath="//input[@formcontrolname=\"englishTranslation\"]")private WebElement englishTraslationfield;
	@FindBy(xpath="//input[@formcontrolname=\"germanTranslation\"]")private WebElement deutschTraslationField;
	
	
 
    @FindBy(xpath="//button[text()=\"Add Translation\"]")private WebElement submitTraslation;
	
		 
		 

			@FindBy(xpath="//select[@id=\"lan-Input\"]")private WebElement productApplication ;
			@FindBy(xpath="//select[@formcontrolname=\"transSubCategoryId\"]")private WebElement traslationSubCategory;
			
			
			@FindBy(xpath="//input[@formcontrolname=\"spanishTranslation\"]")private WebElement spanishTranslationFiled;
			@FindBy(xpath="//input[@formcontrolname=\"franceTranslation\"]")private WebElement franceTranslationField;	 
			@FindBy(xpath="//input[@formcontrolname=\"sloveniaTranslation\"]")private WebElement sloveniaTranslationField;
			@FindBy(xpath="//input[@formcontrolname=\"japanTranslation\"]")private WebElement japanTranslationField ;
			@FindBy(xpath="//input[@formcontrolname=\"englishGenesisTranslation\"]")private WebElement englishGenesisTranslation;
			
			
			
			@FindBy(xpath="(//input[@placeholder=\"Search\"])[2]")private WebElement searchKey ;
			@FindBy(xpath="//select[@class=\"form-select mb-3 pointer ng-valid ng-touched ng-dirty\"]")private WebElement selectProduct2 ;
			
			@FindBy(xpath="(//div[@class=\"d-flex align-items-center\"])[3]")private WebElement getEnglishTran ;
			
			
			
			
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
			// @FindBy(xpath="")private WebElement ;
	
	
	public D_traslation (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public void addTraslation(WebDriver driver,String productNumber,double count, String pName,String tCat,String key, String en,String de,String ProdApplication, String tSubCat, String es,
			String fr, String sl, String jp) throws Throwable
	
	{
		if (productNumber.equals("2")) 
		{
		
		Reporter.log("RETTERAlarm"+true);
		
		File src = new File(".\\DataFile\\TraslationFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		count = sheet.getPhysicalNumberOfRows();
		traslation.click();
		Thread.sleep(2000);
		
		
		
		
		for (int i=1;i<=count-1;i++)
		{
			Reporter.log("TRASLATION NO-"+i,true );
			
			
			pName = sheet.getRow(i).getCell(0).getStringCellValue();
			Reporter.log("Product Name > "+pName, true);
			
			tCat = sheet.getRow(i).getCell(1).getStringCellValue();
			Reporter.log("Translation category > "+tCat, true);


			key = sheet.getRow(i).getCell(2).getStringCellValue();
			Reporter.log("Key > "+key, true);

			en = sheet.getRow(i).getCell(3).getStringCellValue();
			Reporter.log("English traslation > "+en, true);

			de = sheet.getRow(i).getCell(4).getStringCellValue();
			Reporter.log("Deutsch traslation > "+de,true );   
			
//		addTraslation.click();
//		Thread.sleep(2000);
//		
//		Select se1=new Select (selectProduct);
//		se1.selectByVisibleText(pName);
//		Thread.sleep(3000);
//		
//		Select se2=new Select (traslationCategory);
//		se2.selectByVisibleText(tCat);
//		Thread.sleep(3000);
//		
//		Actions act = new Actions (driver);
//		
//		traslationKey.click();
//		act.sendKeys(key).perform();
//		Thread.sleep(2000);
//		
//		englishTraslationfield.click();
//		act.sendKeys(en).perform();
//		
//		Thread.sleep(2000);
//		deutschTraslationField.click();
//		act.sendKeys(de).perform();
//		Thread.sleep(2000);
//		
//		Thread.sleep(1000);
//		submitTraslation.click();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
////		traslation.click();
//		Reporter.log(" ",true );
		
		}
		
		
	}
		
		
		if (productNumber.equals("4")) 
		{
		
		Reporter.log("RETTERSiesmo"+true);
		
		File src = new File(".\\DataFile\\TraslationFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		count = sheet.getPhysicalNumberOfRows();
		traslation.click();
		Thread.sleep(2000);
		
		
		
		
		for (int i=1;i<=count-1;i++)
		{
			Reporter.log("TRASLATION NO-"+i,true );
			
			
			pName = sheet.getRow(i).getCell(0).getStringCellValue();
			Reporter.log("Product Name > "+pName, true);
			
			tCat = sheet.getRow(i).getCell(1).getStringCellValue();
			Reporter.log("Translation category > "+tCat, true);


			key = sheet.getRow(i).getCell(2).getStringCellValue();
			Reporter.log("Key > "+key, true);

			en = sheet.getRow(i).getCell(3).getStringCellValue();
			Reporter.log("English traslation > "+en, true);

			de = sheet.getRow(i).getCell(4).getStringCellValue();
			Reporter.log("Deutsch traslation > "+de,true );   
			
		addTraslation.click();
		Thread.sleep(2000);
		
		Select se1=new Select (selectProduct);
		se1.selectByVisibleText(pName);
		Thread.sleep(3000);
		
		Select se2=new Select (traslationCategory);
		se2.selectByVisibleText(tCat);
		Thread.sleep(3000);
		
		Actions act = new Actions (driver);
		
		traslationKey.click();
		act.sendKeys(key).perform();
		Thread.sleep(2000);
		
		englishTraslationfield.click();
		act.sendKeys(en).perform();
		
		Thread.sleep(2000);
		deutschTraslationField.click();
		act.sendKeys(de).perform();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		submitTraslation.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
//		traslation.click();
		Reporter.log(" ",true );
		
		}
		
		
	}
		
		if (productNumber.equals("7"))
		{
			Actions act = new Actions (driver);
			Reporter.log("Weber rescue hub"+true);
			File src = new File(".\\DataFile\\TraslationFile.xlsx");

			FileInputStream ipt = new FileInputStream(src);

			XSSFWorkbook wb = new XSSFWorkbook(ipt);

			XSSFSheet sheet = wb.getSheetAt(2);
			
			count = sheet.getPhysicalNumberOfRows();
			
			
			traslation.click();
			Thread.sleep(2000);
			
			
			for (int i=1;i<=count-1;i++)
			{
				
				ProdApplication = sheet.getRow(i).getCell(1).getStringCellValue();
				switch (ProdApplication) {
				
				case "Weber":{
				addTraslation.click();
				Thread.sleep(2000);
				
				
				Reporter.log("TRASLATION NO-"+i,true );
				
				
				pName = sheet.getRow(i).getCell(0).getStringCellValue();
				Reporter.log("Product Name > "+pName, true);
				
				ProdApplication = sheet.getRow(i).getCell(1).getStringCellValue();
				Reporter.log("Product Application Name > "+ProdApplication, true);
				
				
				tCat = sheet.getRow(i).getCell(2).getStringCellValue();
				Reporter.log("Translation category > "+tCat, true);
				
				tSubCat = sheet.getRow(i).getCell(3).getStringCellValue();
				Reporter.log("Translation Sub category > "+tSubCat, true);
							

				key = sheet.getRow(i).getCell(4).getStringCellValue();
				Reporter.log("Key > "+key, true);
				
				
		

				
				en = sheet.getRow(i).getCell(5).getStringCellValue();
				Reporter.log("English traslation > "+en, true);

				de = sheet.getRow(i).getCell(6).getStringCellValue();
				Reporter.log("Deutsch traslation > "+de,true );   
				
				es = sheet.getRow(i).getCell(7).getStringCellValue();
				Reporter.log("Spanish traslation > "+es,true ); 
				
				fr = sheet.getRow(i).getCell(8).getStringCellValue();
				Reporter.log("French traslation > "+fr,true ); 
				
				sl = sheet.getRow(i).getCell(9).getStringCellValue();
				Reporter.log("Slovenian traslation > "+sl,true ); 
				
				jp = sheet.getRow(i).getCell(10).getStringCellValue();
				Reporter.log("Japanese traslation > "+jp,true ); 
				
				
				
			
			
			
			Select se1=new Select (selectProduct);
			se1.selectByVisibleText(pName);
			Thread.sleep(1000);
			
			Select se2=new Select (productApplication);
			se2.selectByVisibleText(ProdApplication);
			Thread.sleep(1000);
			
			
			Select se3=new Select (traslationCategory);
			se3.selectByVisibleText(tCat);
			Thread.sleep(1000);
			
			System.out.println(tSubCat);
			Select se4=new Select (traslationSubCategory);
			se4.selectByVisibleText(tSubCat);
			Thread.sleep(1000);
		
			
			
			traslationKey.click();
			act.sendKeys(key).perform();
			Thread.sleep(2000);
			
			englishTraslationfield.click();
			act.sendKeys(en).perform();
			Thread.sleep(1000);
			
			deutschTraslationField.click();
			act.sendKeys(de).perform();
			Thread.sleep(1000);
			
			
			spanishTranslationFiled.click();
			act.sendKeys(es).perform();
			Thread.sleep(1000);
			
			franceTranslationField.click();
			act.sendKeys(fr).perform();
			Thread.sleep(1000);
			
			
			sloveniaTranslationField.click();
			act.sendKeys(sl).perform();
			Thread.sleep(1000);
			
			japanTranslationField.click();
			act.sendKeys(jp).perform();
			
			
			
			Thread.sleep(1000);
			Reporter.log("weber traslation added");
			submitTraslation.click();
			Thread.sleep(3000);
			driver.navigate().refresh();
			traslation.click();
			Reporter.log(" ",true );
			break;
				}
				
				
				
					case  "Genesis":
			
					{
						
					
						addTraslation.click();
						Thread.sleep(2000);
						
						Reporter.log("TRASLATION NO-"+i,true );
						
						
						pName = sheet.getRow(i).getCell(0).getStringCellValue();
						Reporter.log("Product Name > "+pName, true);
						
						ProdApplication = sheet.getRow(i).getCell(1).getStringCellValue();
						Reporter.log("Product Application Name > "+ProdApplication, true);
						
						
						tCat = sheet.getRow(i).getCell(2).getStringCellValue();
						Reporter.log("Translation category > "+tCat, true);
						
						tSubCat = sheet.getRow(i).getCell(3).getStringCellValue();
						Reporter.log("Translation Sub category > "+tSubCat, true);
									


						key = sheet.getRow(i).getCell(4).getStringCellValue();
						Reporter.log("Key > "+key, true);
						
						en = sheet.getRow(i).getCell(5).getStringCellValue();
						Reporter.log("English traslation > "+en, true);
						
					
						Select se1=new Select (selectProduct);
						se1.selectByVisibleText(pName);
						Thread.sleep(1000);
						
						Select se2=new Select (productApplication);
						se2.selectByVisibleText(ProdApplication);
						Thread.sleep(1000);
						
						
						Select se3=new Select (traslationCategory);
						se3.selectByVisibleText(tCat);
						Thread.sleep(1000);
						
						
						Select se4=new Select (traslationSubCategory);
						se4.selectByVisibleText(tSubCat);
						Thread.sleep(1000);
						
						
						
						traslationKey.click();
						act.sendKeys(key).perform();
						Thread.sleep(1000);
						
					englishGenesisTranslation.click();
					act.sendKeys(en).perform();
					Thread.sleep(2000);
					Reporter.log("Genesis traslation added");
					
					
					Reporter.log("Genesis traslation added");
					submitTraslation.click();
					Thread.sleep(3000);
					driver.navigate().refresh();
					traslation.click();
					Reporter.log(" ",true );
					break;
				}
			
			
		

			
		}
		
			}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void checkTraslation(WebDriver driver,String productNumber,double count, String pName,String tCat,String key, String en,String de,String ProdApplication, String tSubCat, String es,
			String fr, String sl, String jp) throws Throwable
	
	{
		
		
	
		if (productNumber.equals("4")) 
		{
		
		Reporter.log("RETTERSiesmo"+true);
		
		File src = new File(".\\DataFile\\TraslationFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		count = sheet.getPhysicalNumberOfRows();
		
		System.out.println(count);
		List<Integer> failedLoopNumbers = new ArrayList<>();

		
		
		traslation.click();
		Thread.sleep(2000);
	
		int failCount =0;
		
		
		for (int i=1;i<=count-1;i++)
		{
	
			Reporter.log("TRASLATION NO-"+i,true );
			
			
			pName = sheet.getRow(i).getCell(0).getStringCellValue();
//			Reporter.log("Product Name > "+pName, true);
			
			tCat = sheet.getRow(i).getCell(1).getStringCellValue();
//			Reporter.log("Translation category > "+tCat, true);


			key = sheet.getRow(i).getCell(2).getStringCellValue();
//			Reporter.log("Key > "+key, true);

			en = sheet.getRow(i).getCell(3).getStringCellValue();
//			Reporter.log("English traslation > "+en, true);

			de = sheet.getRow(i).getCell(4).getStringCellValue();
//			Reporter.log("Deutsch traslation > "+de,true );   
			Actions act = new Actions (driver);
			
			
			
			searchKey.click();
			Thread.sleep(1000);
			act.sendKeys(key).perform();
			Thread.sleep(2000);
			
//			Select se11=new Select (selectProduct2);
//			se11.selectByVisibleText(pName);
//			Thread.sleep(3000);
			
			
			
			act.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
			for (int g=1;g<=4;g++)
			{
				act.sendKeys(Keys.DOWN).build().perform();
			}
			
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(3000);
			
			String enTran = getEnglishTran.getText();
//			System.out.println(enTran);
			
			if (en.equals(enTran)) {
				Reporter.log("**************** ", true);
				Reporter.log("The text match with english traslation.", true);
				Reporter.log("**************** ", true);
	            
	        } 
			else if (de.equals(enTran))
			{
				Reporter.log("**************** ", true);
				Reporter.log("The text match with deutsch traslation.", true);
				Reporter.log("**************** ", true);
				
			}
			
			else {
	        	Reporter.log("**************** ", true);
	        	
	        	Reporter.log("The text does not match with any one.", true);
	        	
	        	Reporter.log(" ", true);

	        	Reporter.log("expected >"+en, true);
				Reporter.log("Actual >"+enTran, true);
	        	Reporter.log("**************** ", true);
	        	failCount =failCount+1;
	        	  failedLoopNumbers.add(i);
	        	
	        	
	        }
			
			driver.navigate().refresh();
			Thread.sleep(2000);
		
			
			Reporter.log(" ", true);
			Reporter.log(" ", true);
		
		}
		
		Reporter.log("faild traslation count  >"+failCount, true);
		Reporter.log("faild traslation loop no  >"+failedLoopNumbers, true);
		Reporter.log(" ", true);
		
	}
		
		else if (productNumber.equalsIgnoreCase("7"))
		{
			System.out.println(" notttttttttttt");
		}
	
	
	
		if (productNumber.equals("7")) 
		{
	
		
		Reporter.log("WEBER RESCUE Hub"+true);
		
		File src = new File(".\\DataFile\\TraslationFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);

		XSSFSheet sheet = wb.getSheetAt(2);
		
		count = sheet.getPhysicalNumberOfRows();
		
		System.out.println(count);
		List<Integer> failedLoopNumbers = new ArrayList<>();

		
		
		traslation.click();
		Thread.sleep(2000);
	
		int failCount =0;
		
		
		for (int i=1;i<=count-1;i++)
		{
	
			Reporter.log("TRASLATION NO-"+i,true );
			
			
			pName = sheet.getRow(i).getCell(0).getStringCellValue();
			Reporter.log("Product Name > "+pName, true);
			
			tCat = sheet.getRow(i).getCell(1).getStringCellValue();
			Reporter.log("Translation category > "+tCat, true);


			key = sheet.getRow(i).getCell(4).getStringCellValue();
			Reporter.log("Key > "+key, true);

			en = sheet.getRow(i).getCell(5).getStringCellValue();
			Reporter.log("English traslation > "+en, true);

			de = sheet.getRow(i).getCell(6).getStringCellValue();
			Reporter.log("Deutsch traslation > "+de,true );   
			Actions act = new Actions (driver);
			
			
			
			searchKey.click();
			Thread.sleep(1000);
			act.sendKeys(key).perform();
			Thread.sleep(2000);
			
//			Select se11=new Select (selectProduct2);
//			se11.selectByVisibleText(pName);
//			Thread.sleep(3000);
			
			
			
			act.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			
			for (int g=1;g<=7;g++)
			{
				act.sendKeys(Keys.DOWN).build().perform();
			
			}
			
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(3000);
			
			String enTran = getEnglishTran.getText();
//			System.out.println(enTran);
			
			if (en.equals(enTran)) {
				Reporter.log("**************** ", true);
				Reporter.log("The text match with english traslation.", true);
				Reporter.log("**************** ", true);
	            
	        } 
			else if (de.equals(enTran))
			{
				Reporter.log("**************** ", true);
				Reporter.log("The text match with deutsch traslation.", true);
				Reporter.log("**************** ", true);
				
			}
			
			else {
	        	Reporter.log("**************** ", true);
	        	
	        	Reporter.log("The text does not match with any one.", true);
	        	
	        	Reporter.log(" ", true);

	        	Reporter.log("expected >"+en, true);
				Reporter.log("Actual >"+enTran, true);
	        	Reporter.log("**************** ", true);
	        	failCount =failCount+1;
	        	  failedLoopNumbers.add(i);
	        	
	        	
	        }
			
			driver.navigate().refresh();
			Thread.sleep(2000);
		
			
			Reporter.log(" ", true);
			Reporter.log(" ", true);
		
		}
		
		Reporter.log("faild traslation count  >"+failCount, true);
		Reporter.log("faild traslation loop no  >"+failedLoopNumbers, true);
		Reporter.log(" ", true);
		
	}
		
		else if (productNumber.equalsIgnoreCase("4"))
		{
			System.out.println(" notttttttttttt");
		}
	
	
	
	
	}
	

}
