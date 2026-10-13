package Baseutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import FileUtillity1.ExcelUtility;
import FileUtillity1.jsonUtility;
import ObjectReposirtory.LoginPag;
import WebDriverUtility.WebDriverUtil;

public class BaseCls {

	
	
	public WebDriverUtil wutil = new WebDriverUtil();
	public jsonUtility jutil = new jsonUtility();

	public ExcelUtility eutil = new ExcelUtility();
		public WebDriver driver = null;
		

		@BeforeSuite
		public void configBS() throws Throwable {
			//db.openconncetion
			System.out.println("Connect to DB");
		}


		@BeforeClass
		
		public void configBC() throws Throwable {

			String BROWSER = jutil.getDataFromJsonfile("browser");
			
			if (BROWSER.equals("chrome")) {
				driver = new ChromeDriver();
			} else if (BROWSER.equals("edge")) {
				driver = new EdgeDriver();
			} else if (BROWSER.equals("firefox")) {
				driver = new FirefoxDriver();
			} else {
				driver = new ChromeDriver();
			}
			wutil.maximizeWindow(driver);
			wutil.waitForPageToLoad(driver);
		}

		@BeforeMethod
		public void configBM() throws Throwable {

			jsonUtility jutil = new jsonUtility();
		String Url =jutil.getDataFromJsonfile("URL");
		driver.get(Url);

			
		}
		@AfterMethod
		public void configAM() throws Throwable {
		
				
		}

		@AfterClass
		public void configAC() {
			driver.quit();
			System.out.println("==close the Browser==");
		}

		@AfterSuite
		public void configAS() throws Throwable {
			//db.closeDbConnection();
			System.out.println("==Close DB, Report backUp=");
		}

	}
