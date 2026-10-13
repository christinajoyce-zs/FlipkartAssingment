package ObjectReposirtory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FileUtillity1.jsonUtility;
import WebDriverUtility.WebDriverUtil;

public class SearchMobilePage {

	
	
	WebDriver driver;
	

	public SearchMobilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='nw1UBF v1zwn26']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//span[contains(text(),'Showing')]")
	private WebElement searchDipslay;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	
	
	
	
	
	
	public void searchMobil(String name ) {
		WebDriverUtil wutil = new WebDriverUtil();

		wutil.mouseHoveringActions(driver, searchBar);
		searchBar.sendKeys(name);
		submitButton.click();
		
		System.out.println(searchDipslay.isDisplayed());
		
	}
	
}
