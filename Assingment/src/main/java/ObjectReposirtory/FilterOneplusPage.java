package ObjectReposirtory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebDriverUtility.WebDriverUtil;

public class FilterOneplusPage {
	
	
	
WebDriver driver;
	

	public FilterOneplusPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='MocAag']")
	private WebElement onePlussearchBar;
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchbutton;
	
	
	@FindBy(xpath ="//label[@class='BMOCJ3 StZidb']/div[text()='OnePlus']")
	private WebElement onpleplusCheckbox;	
	
	
	
	
	public void filterOneplus(String filtername) throws InterruptedException {
		
		WebDriverUtil wutil = new WebDriverUtil();
		wutil.mouseHoveringActions(driver, onePlussearchBar);
		Thread.sleep(100);
		onePlussearchBar.click();

		onePlussearchBar.sendKeys(filtername);
		onpleplusCheckbox.click();
		
		
	}
	

}
