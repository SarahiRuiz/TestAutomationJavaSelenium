package Tests;

import org.testng.annotations.Test;

import PageObjects.App;
import SetUpPackage.SetUp;


public class RadioButtonTests extends SetUp{
	private App App = new App();
	@Test
	public void StepsToSelectRadioButton() throws InterruptedException
	{
		App.DemoQaPage.VerifyDemoQaPageDisplayed();
		App.DemoQaPage.GoToRadioButtonPage();
	}
}
