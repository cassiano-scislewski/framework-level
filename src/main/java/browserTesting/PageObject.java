package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

	WebDriver driver;

	public PageObject(WebDriver driver) {

		this.driver = driver;
	}

	private WebElement _Type() {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"type\"]//*[@value=\"3\"]"));

		return element;
	}

	private WebElement _Plan() {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"support\"]//*[@value=\"5\"]"));

		return element;
	}

	private WebElement _Monthlyduration() {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"duration\"]"));

		return element;
	}

	private WebElement _Calculate() {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"calculate\"]"));

		return element;
	}

	public WebElement Type() {

		WebElement element = _Type();

		return element;

	}

	public WebElement Plan() {

		WebElement element = _Plan();

		return element;

	}

	public WebElement Monthlyduration() {

		WebElement element = _Monthlyduration();

		return element;

	}

	public WebElement Calculate() {

		WebElement element = _Calculate();

		return element;

	}

}