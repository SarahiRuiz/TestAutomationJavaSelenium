package Data;

import java.util.Arrays;
import java.util.Iterator;
import org.testng.annotations.DataProvider;
import Instances.FillFormListInstances;
import Models.FillFormListModel.Users;

public class FillFormData {
	
	@DataProvider(name = "FillFormData")
    public static Iterator<Object[]> FillFormData() {
        return Arrays.asList(
                new Object[]{Users.Miguel, FillFormListInstances.MiguelData},
                new Object[]{Users.Billy, FillFormListInstances.BillyData},
                new Object[]{Users.Juan, FillFormListInstances.JuanData}
        ).iterator();
    }
}
