package PageObjects;
import SetUpPackage.SetUp;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App extends SetUp{

	public DemoQaPage DemoQaPage = new DemoQaPage();
	public Boolean WaitForElementToBeClickable(WebElement element, int waitTimeSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSeconds));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	public Boolean WaitForElement(WebElement element, int waitTimeSeconds)
	{
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSeconds));
		return IteratorWaitForElement(wait, element);
	}
	public Boolean IteratorWaitForElement(WebDriverWait wait, WebElement element)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	/*public Boolean Click(By byElement, int waitTimeSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSeconds));
        wait.until(
        		try
        		{
        			ExpectedConditions.elementToBeClickable(byElement);
        			return true;
        		}
        		catch(Exception e)
        		{
        			return false;
        		}
        );
	}*/
}
