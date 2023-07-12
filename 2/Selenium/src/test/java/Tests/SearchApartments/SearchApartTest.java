package Tests.SearchApartments;

import Tests.base.BaseTest;
import org.testng.annotations.Test;

public class SearchApartTest extends BaseTest {
    @Test
    public void checkIsRedirectToListing() {

        basePage.open("https://realt.by/");

//        switchWindow();

        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage
                .checkCountCards();

    }


}


