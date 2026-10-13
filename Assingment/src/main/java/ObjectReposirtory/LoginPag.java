package ObjectReposirtory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FileUtillity1.jsonUtility;
import WebDriverUtility.WebDriverUtil;


public class LoginPag extends WebDriverUtil {

	WebDriver driver;
	jsonUtility jutil = new jsonUtility();
	WebDriverUtil wutil = new WebDriverUtil();

	public LoginPag(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@role='button']")
	private WebElement alertSymbol;

	public void loginToApp() throws Throwable {
		wutil.waitForPageToLoad(driver);
		Thread.sleep(6000);
		alertSymbol.click();

	}

}
