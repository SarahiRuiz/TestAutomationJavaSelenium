package PageObjects;

import SetUpPackage.SetUp;
import Enums.DemoQaPageEnums;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQaPage extends SetUp{
	
	protected DemoQaPageEnums DemoQaPageElements = new DemoQaPageEnums();
	
	public void VerifyDemoQaPageDisplayed()
	{
		WebElement logoImage = driver.findElement(DemoQaPageElements.Logo);
		assertTrue(logoImage.isDisplayed(), "Verify logo Demo QA is displayed");
	}
	public void GoToRadioButtonPage() throws InterruptedException
	{
		WebElement elementsTitle = driver.findElement(DemoQaPageElements.ElementsTitle);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    wait.until(d -> elementsTitle.isDisplayed());
	    assertTrue(elementsTitle.isDisplayed(), "Verify Element Title is displayed");
		actions.scrollToElement(elementsTitle).perform();
		elementsTitle.click();
		Thread.sleep(10000);
	}
}
