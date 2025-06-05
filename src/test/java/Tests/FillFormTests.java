package Tests;

import org.testng.annotations.*;
import Data.FillFormData;
import SetUpPackage.SetUp;
import Models.FillFormListModel;
import Models.FillFormListModel.Users;
import PageObjects.App;

public class FillFormTests extends SetUp{
	private App App = new App();
	@Test(dataProvider = "FillFormData", dataProviderClass = FillFormData.class)
    void FillFormSteps(Users user, FillFormListModel fillFormData) throws InterruptedException {
		//Thread.sleep(2000);
		App.DemoQaPage.VerifyDemoQaPageDisplayed();
    }
}
