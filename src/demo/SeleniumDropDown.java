package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("file:///C:/Users/Monsu/OneDrive/Desktop/WEMSUmmerWebpage.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // select class object creation

        WebElement webElementSelectClass= driver.findElement(By.xpath("//select[@id='select']"));

        Select select = new Select(webElementSelectClass);
       // select.selectByIndex(2);
        //select.selectByVisibleText("Bus");
        select.selectByValue("C");

        Thread.sleep(3000);

        driver.quit();


    }
}
