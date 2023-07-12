package Tests.SearchApartments;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider
    public Object[][] dataProvideMethod() {
        return new Object[][] {
                {"1", " string"},
                {"2", " string"},
                {"3", " string"}
        };
    }
}
