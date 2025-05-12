package live;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class AAA_baseClass {
	WebDriver driver;
	String productNumber;
	int rowCount;
	double count ;
	String pName;
	String tCat;
	String key;
	String en;
	String de;
	String es;
	String fr;
	String sl;
	String jp;
	
	String ProdApplication;
	String tSubCat;
	
	
	
	

	public  void browserLonch  () throws   Throwable {

		// WebDriverManager.chromedriver().setup();
		
	 //driver = new HtmlUnitDriver();

		//driver = new EdgeDriver();
		 
		
		
		
		File src = new File(".\\DataFile\\TraslationFile.xlsx");

		FileInputStream ipt = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(ipt);
		
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the branch name
		System.out.print("Select product name ");
		System.out.print("Rescue World > 1 ");
		System.out.print("RETTERAlarm > 2 ");
		System.out.print("RETTERAcademy > 3 ");
		System.out.print("RETTERDispatcher > 4 ");
		System.out.print("RETTERSeismo > 5 ");
		System.out.print("RETTERPractise > 6 ");

		System.out.print("WEBER RESCUE Hub > 7 ");
	
				
		System.out.println();
		
		productNumber = scanner.nextLine();
		 
		 

		
		  
		
		  
		driver= new ChromeDriver();		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin.weberrescueworld.com/login");
		driver.manage().window().maximize();
		
		
	

	
		
	}
	
	
	
	
	
	
}
