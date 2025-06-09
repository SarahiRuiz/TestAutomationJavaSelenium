package SetUpPackage;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
	
	protected static WebDriver driver;
	protected static Actions actions;
	protected static WebDriverWait wait;
	
	@BeforeTest
    public void SetUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
    }
	@AfterTest
    public void TearDownTest() {
		driver.quit();
    }
}
