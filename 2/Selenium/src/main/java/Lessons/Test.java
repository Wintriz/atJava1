//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Test {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
//
//
//        driver.get("https://www.google.com/");
//
//        WebElement input = driver.findElement(By.id("QWE"));
//        WebElement input = driver.findElement(By.cssSelector("*"));
//
//        By input = By.xpath("//*[@id=\"APjFqb\"]");
//
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a/span"));
//
//        element.click();
//
//        WebElement element = driver.findElement(input);
////element.sendKeys("C://videos/video.mp4", Keys.ENTER); загрузка файла
//
//        element.sendKeys("автомобили", Keys.ENTER);
//
//        By enter = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3");
//        WebElement element1 = driver.findElement(enter);
//
//        element1.click();
//
//
//    }
//}
