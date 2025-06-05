package Tests;


import io.cucumber.java.en.*;
import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CucumberTest{
	
	protected static WebDriver driver;
	protected static Actions actions;
	protected static WebDriverWait wait;
	
	@Before
    public void SetUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
	@After
    public void TearDownTest() {
		driver.quit();
    }
	
	@When("Going To Page {string}")
	public void Going_To_Page(String urlPage) throws InterruptedException
	{
		driver.get(urlPage);
		Thread.sleep(5000);
	}
	@When("Wait And Select Radio Button Yes")
	public void Wait_And_Select_Radio_Button_Yes(String urlPage)
	{
		WebElement radioYesButton = driver.findElement(By.id("yesRadio"));        
        ((JavascriptExecutor) driver).executeScript(
        	    "arguments[0].scrollIntoView({block: 'center'});", radioYesButton);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("yesRadio"),0));
        actions.click(radioYesButton).perform();
	}
	@When("Verify Radio Button Yes Selected")
	public void Verify_Radio_Button_Yes_Selected() throws InterruptedException
	{
		Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You have selected ']/span[text()='Yes']")));
        WebElement successYesMessage = driver.findElement(By.xpath("//p[text()='You have selected ']/span[text()='Yes']"));
        Assert.assertTrue(successYesMessage.isDisplayed(), "Verify success yes is displayed.");
	}
}
