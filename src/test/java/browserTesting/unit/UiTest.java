package browserTesting.unit;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import browserTesting.Setup;
import browserTesting.Steps;

public class UiTest {

	WebDriver driver;
	Setup setup = new Setup();
	Steps steps;

	@Before
	public void setup() {

		driver = setup.SetupDriver();
		steps = new Steps(driver);
		
	}

	@Test
	public void runTest() {

		steps.WorkFlow();
	}

	@After
	public void tearDown() {

		setup.TearDownTest();
	}

}