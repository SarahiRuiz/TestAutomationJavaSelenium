package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import SetUpPackage.SetUp;

public class RadioButtonPage extends SetUp{

	public void SelectRadioButton() throws Exception
	{
		Thread.sleep(5000);
        WebElement radioYesButton = driver.findElement(By.id("yesRadio"));        
        ((JavascriptExecutor) driver).executeScript(
        	    "arguments[0].scrollIntoView({block: 'center'});", radioYesButton);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("yesRadio"),0));
        actions.click(radioYesButton).perform();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You have selected ']/span[text()='Yes']")));
        WebElement successYesMessage = driver.findElement(By.xpath("//p[text()='You have selected ']/span[text()='Yes']"));
        Assert.assertTrue(successYesMessage.isDisplayed(), "Verify success yes is displayed.");
	}
}
