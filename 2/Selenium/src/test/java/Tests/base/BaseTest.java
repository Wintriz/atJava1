package Tests.base;

import Common.CommonAction;
import Pages.Listing.RealtListingPage;
import Pages.Realthome.RealtHomePage;
import Pages.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

    @AfterSuite(alwaysRun = true)
    public void quite() {
        driver.quit();
    }
//    WebDriverWait wait = new WebDriverWait(driver, 10); работа с предупреждениями опять ошибка времени
   protected void switchWindow() {
//        JavascriptExecutor js = (JavascriptExecutor) driver; открыть новое окно
//
//        String window1 = driver.getWindowHandle();
//
//        js.executeScript("window.open()");
//
//        Set<String> currentWindows = driver.getWindowHandles();
//
//        String window2 = null;
//
//        for (String window : currentWindows) {
//            if (!window.equals(window1)) {
//                window2 = window;
//                break;
//            }
//        }
//
//        driver.switchTo().window(window2);

//       Alert alert = wait.until(ExpectedConditions.alertIsPresent()); всплывающие предупреждения
//       driver.switchTo().alert();
//       alert.accept();


    }


}
