package SetUpPackage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
	
	protected static WebDriver driver;
	
	@BeforeTest
    public void SetUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
    }
	@AfterTest
    public void TearDownTest() {
		WebDriverManager.chromedriver().setup();
		driver.quit();
    }
}
