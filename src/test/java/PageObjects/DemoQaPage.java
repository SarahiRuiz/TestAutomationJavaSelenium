package PageObjects;

import SetUpPackage.SetUp;
import Enums.DemoQaPageEnums;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;

public class DemoQaPage extends SetUp{
	
	protected DemoQaPageEnums DemoQaPageElements = new DemoQaPageEnums();
	
	public void VerifyDemoQaPageDisplayed()
	{
		WebElement logoImage = driver.findElement(DemoQaPageElements.Logo);
		assertTrue(logoImage.isDisplayed(), "Verify logo Demo QA is displayed");
	}
}
