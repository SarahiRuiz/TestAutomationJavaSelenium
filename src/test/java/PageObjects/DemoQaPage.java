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
		Thread.sleep(5000);
		WebElement elementsTitle = driver.findElement(DemoQaPageElements.ElementsTitle);
	    wait.until(d -> elementsTitle.isDisplayed());
	    assertTrue(elementsTitle.isDisplayed(), "Verify Element Title is displayed");
		actions.scrollToElement(elementsTitle).perform();
		elementsTitle.click();
		WebElement radioButtonTitle = driver.findElement(DemoQaPageElements.RadioButtonTitle);
	    wait.until(d -> radioButtonTitle.isDisplayed());
	    radioButtonTitle.click();
		Thread.sleep(10000);
	}
}
