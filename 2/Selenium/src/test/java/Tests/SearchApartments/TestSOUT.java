package Tests.SearchApartments;

import org.testng.annotations.Test;

public class TestSOUT {

    @Test(dataProvider = "dataProvideMethod", dataProviderClass = DataProviderClass.class)
    public void testSOUT(String number, String string) {
        System.out.println("TEST SOUT! " + number + string);
    }
}
