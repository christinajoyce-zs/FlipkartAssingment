package WebDriverUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtil {
	
	
	
	
	public void accessToApplication(WebDriver driver, String URL) {
		driver.get(URL);
	}

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}

	public void waitForElementPresent(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToWindow(WebDriver driver) {

		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
			if (!id.equals(parentId)) {
				driver.switchTo().window(id);
			}
		}
	}

	public void switchToParentWindow(WebDriver driver, String parentId) {

		driver.switchTo().window(parentId);
	}

	

	public void selectOptionByVisibleText(WebElement dropdownEle, String visibleText) {
		Select sel = new Select(dropdownEle);
		sel.selectByVisibleText(visibleText);
	}

	public void selectOptionByValue(WebElement dropdownEle, String valueAttribute) {
		Select sel = new Select(dropdownEle);
		sel.selectByValue(valueAttribute);
	}

	public void mouseHoveringActions(WebDriver driver, WebElement targetEle) {
		Actions act = new Actions(driver);
		act.moveToElement(targetEle).perform();
	}

	
	public void doubleClickOperation(WebDriver driver, WebElement targetEle) {
		Actions act = new Actions(driver);
		act.scrollToElement(targetEle);
	}
	

	 public void launchChromeWithoutNotifications() {
		// TODO Auto-generated method stub
	        ChromeOptions options = new ChromeOptions();

	        options.addArguments("--disable-notifications");
	 }

}
