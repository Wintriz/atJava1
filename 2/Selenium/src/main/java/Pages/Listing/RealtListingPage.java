package Pages.Listing;

import Pages.Realthome.RealtHomePage;
import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/main/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[1]/div/div/div/a/div");

    public RealtListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));
        int countCard;
        countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 30);
        return this;
    }



}
