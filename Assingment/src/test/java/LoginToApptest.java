import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Baseutility.BaseCls;
import FileUtillity1.jsonUtility;
import ObjectReposirtory.FilterOneplusPage;
import ObjectReposirtory.LoginPag;
import ObjectReposirtory.SearchMobilePage;
import WebDriverUtility.WebDriverUtil;



public  class LoginToApptest extends BaseCls {
	LoginPag lp;

	
	@Test
	public void LoginApp() throws Throwable {

		jsonUtility jutil = new jsonUtility();
		String Url = jutil.getDataFromJsonfile("URL");

		 lp = new LoginPag(driver);
		lp.loginToApp();
	}
	
	
	@Test(priority = 2, dependsOnMethods = "LoginApp")
	public void SearchMobiles() throws Throwable {
	
	String mobiledata	=eutil.getDataFRomExcel("SearchMobile", 0, 0);
	
	SearchMobilePage mb = new SearchMobilePage(driver);
	mb.searchMobil(mobiledata);
	
		
		
	}
	
	
	
	@Test(priority = 3, dependsOnMethods = "SearchMobiles")
	
	public void filterOnplus() throws Throwable {
		
		String filterdata	=eutil.getDataFRomExcel("SearchMobile", 1, 0);
		
		FilterOneplusPage fp = new FilterOneplusPage(driver);
		fp.filterOneplus(filterdata);
		
	}

	
	
}
