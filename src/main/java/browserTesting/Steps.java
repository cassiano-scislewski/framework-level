package browserTesting;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Steps {

	WebDriver driver;
	String baseUrl = "https://qa-automation-challenge.github.io/sandbox/";
	String priceExpeted = "2249.10 $";
	String duration = "6";
	PageObject pageobject;
	
	
	public Steps(WebDriver driver) {

		this.driver = driver;
		pageobject = new PageObject(driver);
	}

	
	
	public void WorkFlow() {

		
		NavegateUrl(baseUrl);
		selectType();
		selectSupportPlan();
		writeMonthlyDuration(duration);
		clickCalculatePriceButton();
		Assert();

	}

	public void NavegateUrl(String baseUrl) {
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	public void selectType() {
		pageobject.Type().click();
	}

	public void selectSupportPlan() {
		pageobject.Plan().click();
	}

	public void writeMonthlyDuration(String duration) {
		pageobject.Monthlyduration().sendKeys(duration);
	}

	public void clickCalculatePriceButton() {
		pageobject.Calculate().click();
	}

	public void Assert() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement priceFromScreen = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"price\"]"))));
		Assert.assertEquals(priceExpeted, priceFromScreen.getText());
	}

}
