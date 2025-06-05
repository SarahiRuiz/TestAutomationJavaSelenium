package Tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonTests{
	
	protected static WebDriver driver;
	protected static Actions actions;
	protected static WebDriverWait wait;
	
	@BeforeTest
    public void SetUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
	@AfterTest
    public void TearDownTest() {
		WebDriverManager.chromedriver().setup();
		driver.quit();
    }
	
	@Test
	public void FillRadioButton() throws Exception
	{
		driver.get("https://demoqa.com/radio-button");
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
