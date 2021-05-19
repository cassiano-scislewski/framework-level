package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

	WebDriver driver;

	public WebDriver SetupDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cscislewski\\Desktop\\Cassiano\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;
	}

	public void TearDownTest() {
		driver.quit();
	}

}
