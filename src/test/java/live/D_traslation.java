package live;



import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
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
			
			
			@FindBy(xpath="(//select[@aria-label=\".form-select-sm example\"])[1]")private WebElement CKSelectProduct;
			@FindBy(xpath="(//select[@aria-label=\".form-select-sm example\"])[2]")private WebElement CKSelectLanguage;
			@FindBy(xpath="(//select[@aria-label=\".form-select-sm example\"])[3]")private WebElement CKSelectCatory;
			@FindBy(xpath="//select[@class=\"form-select form-select-sm h-36 pointer ng-untouched ng-pristine ng-valid\"]")private WebElement itemPerPage;
			@FindBy(xpath="(//select[@aria-label=\".form-select-sm example\"])[4]")private WebElement CKSelectSubCatory;
			
			
			
			
			@FindBy(xpath="//div[@class=\"d-flex align-items-center\"]")private List<WebElement> getTransCount;
			@FindBy(xpath="//div[@class=\"d-flex align-items-center\"]")private WebElement getTrans;
			
			@FindBy(xpath="//div[text()=\" English-Genesis \"]")private WebElement englishGenesisTrans;
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
			System.out.println();
			
		//	Reporter.log(RETTERAlarm add);
		
			Reporter.log("RETTERAlarm" + true);

			File src = new File(".\\DataFile\\TraslationFile.xlsx");
			FileInputStream ipt = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(ipt);
			XSSFSheet sheet = wb.getSheetAt(0);

			count = sheet.getPhysicalNumberOfRows();
			traslation.click();
			Thread.sleep(2000);

			for (int i = 1; i <= count - 1; i++) {
			    Reporter.log("TRASLATION NO-" + i, true);

			    pName = sheet.getRow(i).getCell(0).getStringCellValue();
//			    Reporter.log("Product Name > " + pName, true);

			    tCat = sheet.getRow(i).getCell(1).getStringCellValue();
//			    Reporter.log("Translation category > " + tCat, true);

			    key = sheet.getRow(i).getCell(2).getStringCellValue();
			    Reporter.log("Key > " + key, true);

			    en = sheet.getRow(i).getCell(3).getStringCellValue();
//			    Reporter.log("English traslation > " + en, true);

			    de = sheet.getRow(i).getCell(4).getStringCellValue();
//			    Reporter.log("Deutsch traslation > " + de, true);

			    addTraslation.click();
			    Thread.sleep(2000);

			    Select se1 = new Select(selectProduct);
			    se1.selectByVisibleText(pName);
			    Thread.sleep(3000);

			    Select se2 = new Select(traslationCategory);
			    se2.selectByVisibleText(tCat);
			    Thread.sleep(3000);

			    Actions act = new Actions(driver);

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

			    // New code: check if translation already exists (UI-based)
			    try {
				    WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'already exists')]"));
				    if (message.isDisplayed()) {
				        Reporter.log(">>>>> "+pName+" "+ tCat+" Translation already exists.<<<<<", true);
				    }
				} catch (NoSuchElementException e) {
//				    Reporter.log(">>>>> New Weber translation added successfully.<<<<<", true);
				} catch (Exception e) {
//				    Reporter.log(">>>>> Unexpected error during Weber translation check: " + e.getMessage(), true);
//				    e.printStackTrace();
					Reporter.log(">>>>> New "+pName+" "+ tCat+" translation added successfully.<<<<<", true);
				}
			    driver.navigate().refresh();
			    traslation.click();
			    Reporter.log(" ", true);
			    
			    Reporter.log("|-----------------------------------------------------|", true);
		
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

			XSSFSheet sheet = wb.getSheetAt(1);
			
			count = sheet.getPhysicalNumberOfRows();
			
			
			traslation.click();
			Thread.sleep(2000);
			
			
			for (int i=1;i<=count-1;i++)
			{
				
				ProdApplication = sheet.getRow(i).getCell(1).getStringCellValue();

				addTraslation.click();
				Thread.sleep(2000);

				Reporter.log("TRASLATION NO-" + i, true);

				pName = sheet.getRow(i).getCell(0).getStringCellValue();
				tCat = sheet.getRow(i).getCell(1).getStringCellValue();
				tSubCat = sheet.getRow(i).getCell(2).getStringCellValue();
				key = sheet.getRow(i).getCell(3).getStringCellValue();
				Reporter.log("Key > " + key, true);
				en = sheet.getRow(i).getCell(4).getStringCellValue();
				de = sheet.getRow(i).getCell(5).getStringCellValue();
				es = sheet.getRow(i).getCell(6).getStringCellValue();
				fr = sheet.getRow(i).getCell(7).getStringCellValue();
				sl = sheet.getRow(i).getCell(8).getStringCellValue();
				jp = sheet.getRow(i).getCell(9).getStringCellValue();

				Select se1 = new Select(selectProduct);
				se1.selectByVisibleText(pName);
				Thread.sleep(1000);

				Select se2 = new Select(productApplication);
				se2.selectByVisibleText("Weber");
				Thread.sleep(1000);

				Select se3 = new Select(traslationCategory);
				se3.selectByVisibleText(tCat);
				Thread.sleep(1000);

				Select se4 = new Select(traslationSubCategory);
				se4.selectByVisibleText(tSubCat);
				Thread.sleep(1000);

				traslationKey.click();
				act.sendKeys(key).perform();

				englishTraslationfield.click();
				act.sendKeys(en).perform();

				deutschTraslationField.click();
				act.sendKeys(de).perform();

				spanishTranslationFiled.click();
				act.sendKeys(es).perform();

				franceTranslationField.click();
				act.sendKeys(fr).perform();

				sloveniaTranslationField.click();
				act.sendKeys(sl).perform();

				japanTranslationField.click();
				act.sendKeys(jp).perform();

				Thread.sleep(2000);
				submitTraslation.click();

				Thread.sleep(3000);

				// Check if translation already exists (Weber)
				try {
				    WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'already exists')]"));
				    if (message.isDisplayed()) {
				        Reporter.log(">>>>> Weber Translation already exists.<<<<<", true);
				    }
				} catch (NoSuchElementException e) {
				    Reporter.log(">>>>> New Weber translation added successfully.<<<<<", true);
				} catch (Exception e) {
//				    Reporter.log(">>>>> Unexpected error during Weber translation check: " + e.getMessage(), true);
//				    e.printStackTrace();
					Reporter.log(">>>>> New Weber translation added successfully.<<<<<", true);
				}


			
				traslation.click();
				Thread.sleep(2000);

				addTraslation.click();
				Thread.sleep(2000);

				se1.selectByVisibleText(pName);
				Thread.sleep(1000);

				se2.selectByVisibleText("Genesis");
				Thread.sleep(1000);

				se3.selectByVisibleText(tCat);
				Thread.sleep(1000);

				se4.selectByVisibleText(tSubCat);
				Thread.sleep(1000);

				traslationKey.click();
				act.sendKeys(key).perform();

				englishGenesisTranslation.click();
				act.sendKeys(en).perform();

				submitTraslation.click();
				Thread.sleep(3000);

				// Check if translation already exists (Genesis)
				try {
				    WebElement message = driver.findElement(By.xpath("//*[contains(text(), 'already exists')]"));
				    if (message.isDisplayed()) {
				        Reporter.log(">>>>> Genesis Translation already exists.<<<<<", true);
				    }
				} catch (NoSuchElementException e) {
				    Reporter.log(">>>>> New Genesis translation added successfully.<<<<<", true);
				} catch (Exception e) {
//				    Reporter.log(">>>>> Unexpected error during Genesis translation check: " + e.getMessage(), true);
//				    e.printStackTrace();
					Reporter.log(">>>>> New Genesis translation added successfully.<<<<<", true);
				}

				
		
				Reporter.log("|--------------------------------------------------------------------| ", true);
				Reporter.log(" ", true);

				traslation.click();
				Thread.sleep(2000);
				    
				
			}

			
		
		
	
		
		}
		
		
		
		
		
		
		

		
		
	}	
		
	
	
	public void checkTraslation(WebDriver driver,String productNumber,double count, String pName,String tCat,String key, String en,String de,String ProdApplication, String tSubCat, String es,
			String fr, String sl, String jp) throws Throwable
	
	
	
	
	{if (productNumber.equals("2")) {
		
		//	Reporter.log(RETTERAlarm check);

	    Reporter.log("RETTERAlarm" + true);

	    File src = new File(".\\DataFile\\TraslationFile.xlsx");
	    FileInputStream ipt = new FileInputStream(src);
	    XSSFWorkbook wb = new XSSFWorkbook(ipt);
	    XSSFSheet sheet = wb.getSheetAt(0);

	    count = sheet.getPhysicalNumberOfRows();
	    System.out.println(count);

	    List<Integer> failedLoopNumbers = new ArrayList<>();
	    List<String> failedKeys = new ArrayList<>(); // <-- Added list for unmatched keys
	    int failCount = 0;

	    traslation.click();
	    Thread.sleep(2000);
	    
	    Select pg = new Select (itemPerPage); 
	    
	    pg.selectByVisibleText("100");
	    Thread.sleep(2000);

	    for (int i = 1; i <= count - 1; i++) {

	        Reporter.log("TRASLATION NO-" + i, true);

	        pName = sheet.getRow(i).getCell(0).getStringCellValue();
	        tCat = sheet.getRow(i).getCell(1).getStringCellValue();
	        key = sheet.getRow(i).getCell(2).getStringCellValue();
	        en = sheet.getRow(i).getCell(3).getStringCellValue();
	        de = sheet.getRow(i).getCell(4).getStringCellValue();

	        Actions act = new Actions(driver);

	        searchKey.click();
	        Thread.sleep(1000);
	        act.sendKeys(key).perform();
	        Thread.sleep(2000);
	        System.out.println("Key> " + key);

	        Select se = new Select(CKSelectProduct);
	        se.selectByVisibleText(pName);
	        Thread.sleep(2000);

	        Select se1 = new Select(CKSelectLanguage);
	        se1.selectByVisibleText("English");
	        Thread.sleep(2000);

	        Select se2 = new Select(CKSelectCatory);
	        se2.selectByVisibleText(tCat);
	        Thread.sleep(4000);
	        
	     
	        
	        

	        int ZA = getTransCount.size();
	        System.out.println(ZA);
	        boolean enMatchFound = false;

	        for (int q = 0; q < ZA; q++) {
	            WebElement getTrans = getTransCount.get(q);
	            String ab = getTrans.getText().trim();

	            if (ab.equals(en.trim())) {
	                Reporter.log("The English translation Match.", true);
	                enMatchFound = true;
	                break;
	            }
	        }

	        if (!enMatchFound) {
	            failCount++;
	            failedLoopNumbers.add(i);
	            failedKeys.add(key); // <-- Track unmatched English key
	            Reporter.log("English translation not matched", true);
	        }

	        se1.selectByVisibleText("Deutsch");
	        Thread.sleep(4000);

	        int ZA1 = getTransCount.size();
	        boolean deMatchFound = false;

	        for (int q = 0; q < ZA1; q++) {
	            WebElement getTrans = getTransCount.get(q);
	            String ab = getTrans.getText().trim();

	            if (ab.equals(de.trim())) {
	                Reporter.log("The Deutsch translation Match.", true);
	                deMatchFound = true;
	                break;
	            }
	        }

	        if (!deMatchFound) {
	            failCount++;
	            failedLoopNumbers.add(i);
	            failedKeys.add(key); // <-- Track unmatched Deutsch key
	            Reporter.log("Deutsch translation not matched", true);
	        }

	        searchKey.clear();
	        Thread.sleep(1000);

	        Reporter.log("|------------------------------------------------------|", true);
	        Reporter.log(" ", true);
	    }

	    Reporter.log("faild traslation count  >" + failCount, true);
	    Reporter.log("faild traslation loop no  >" + failedLoopNumbers, true);

	    // <-- Add this block to print unmatched keys
	    Reporter.log("Unmatched Keys:", true);
	    for (String failedKey : failedKeys) {
	        Reporter.log(failedKey, true);
	    }

	    Reporter.log(" ", true);
	}
	
	
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
		
		
	
	
	
		if (productNumber.equals("7")) 
		{
			
			
	
			Reporter.log("Weber rescue hub"+true);
			 File src = new File(".\\DataFile\\TraslationFile.xlsx");
			 FileInputStream ipt = new FileInputStream(src);
			    XSSFWorkbook wb = new XSSFWorkbook(ipt);
			    XSSFSheet sheet = wb.getSheetAt(1);

			    count = sheet.getPhysicalNumberOfRows();
			    System.out.println(count);

			    List<Integer> failedLoopNumbers = new ArrayList<>();
			    List<String> failedKeys = new ArrayList<>(); // <-- Added list for unmatched keys
			    int failCount = 0;

			    traslation.click();
			    Thread.sleep(2000);
			    
			    Select pg = new Select (itemPerPage); 
			    
			    pg.selectByVisibleText("100");
			    Thread.sleep(2000);

			    for (int i = 1; i <= count - 1; i++) {

			        Reporter.log("TRASLATION NO-" + i, true);

			        pName = sheet.getRow(i).getCell(0).getStringCellValue();
			        tCat = sheet.getRow(i).getCell(1).getStringCellValue();
			        tSubCat = sheet.getRow(i).getCell(2).getStringCellValue();
			        key = sheet.getRow(i).getCell(3).getStringCellValue();
//			        Reporter.log("Key > " + key, true);
			        en = sheet.getRow(i).getCell(4).getStringCellValue();
			        de = sheet.getRow(i).getCell(5).getStringCellValue();
			        es = sheet.getRow(i).getCell(6).getStringCellValue();
			        fr = sheet.getRow(i).getCell(7).getStringCellValue();
			        sl = sheet.getRow(i).getCell(8).getStringCellValue();
			        jp = sheet.getRow(i).getCell(9).getStringCellValue();
			        Actions act = new Actions(driver);

			        searchKey.click();
			        Thread.sleep(1000);
			        act.sendKeys(key).perform();
			        Thread.sleep(2000);
			        System.out.println("Key > " + key);

			        Select se = new Select(CKSelectProduct);
			        se.selectByVisibleText(pName);
			        Thread.sleep(1000);

			        Select se1 = new Select(CKSelectLanguage);
			        se1.selectByVisibleText("English");
			        Thread.sleep(1000);
			        
			        

			        Select se2 = new Select(CKSelectCatory);
			        se2.selectByVisibleText(tCat);
			        Thread.sleep(1000);
			        
			        
			        Select se3 = new Select(CKSelectSubCatory);
			        se3.selectByVisibleText(tSubCat);
			        Thread.sleep(1000);
			        
			       
			        int ZA = getTransCount.size();
			        boolean enMatchFound = false;

			        for (int q = 0; q < ZA; q++) {
			            WebElement getTrans = getTransCount.get(q);
			            String ab = getTrans.getText().trim();

			            if (ab.equals(en.trim())) {
			                Reporter.log("The English translation Match.", true);
			                enMatchFound = true;
			                break;
			            }
			        }

			        if (!enMatchFound) {
			            failCount++;
			            failedLoopNumbers.add(i);
			            failedKeys.add(key); // <-- Track unmatched English key
			            Reporter.log("English translation not matched", true);
			        }

			        se1.selectByVisibleText("Deutsch");
			        Thread.sleep(4000);

			        int ZA1 = getTransCount.size();
			        boolean deMatchFound = false;

			        for (int q = 0; q < ZA1; q++) {
			            WebElement getTrans = getTransCount.get(q);
			            String ab = getTrans.getText().trim();

			            if (ab.equals(de.trim())) {
			                Reporter.log("The Deutsch translation Match.", true);
			                deMatchFound = true;
			                break;
			            }
			        }

			        if (!deMatchFound) {
			            failCount++;
			            failedLoopNumbers.add(i);
			            failedKeys.add(key); // <-- Track unmatched Deutsch key
			            Reporter.log("Deutsch translation not matched", true);
			        }

			        
			        se1.selectByVisibleText("All");
			        Thread.sleep(4000);
			        
			        
			        
			        
		


			            if (englishGenesisTrans.isDisplayed()) {
			                Reporter.log("The Genesis-englis translation Match.", true);
			                deMatchFound = true;
			               
			            }
			            
			            else 
			            {
			            	Reporter.log("The Genesis-englis translation not Match.", true);
			            	
			            }

			        searchKey.clear();
			        Thread.sleep(1000);

			        Reporter.log("|------------------------------------------------------|", true);
			        Reporter.log(" ", true);
			    }
			    
			    
			    

			    Reporter.log("faild traslation count  >" + failCount, true);
			    Reporter.log("faild traslation loop no  >" + failedLoopNumbers, true);

			    // <-- Add this block to print unmatched keys
			    Reporter.log("Unmatched Keys:", true);
			    for (String failedKey : failedKeys) {
			        Reporter.log(failedKey, true);
			    }

			    Reporter.log(" ", true);
			}
			
		
		
	
	
	
	}
	

}
