package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertsSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/Windows/Chrome/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/test/delete_customer.php");
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        WebElement elementInput= driver.findElement(By.name("cusid"));
        elementInput.click();
        elementInput.sendKeys("76");
        Thread.sleep(2000);
        elementInput.submit();
        Thread.sleep(2000);
        //Creating object of Alert
        driver.switchTo().alert().accept();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement elementInput2= driver.findElement(By.name("cusid"));
        elementInput2.click();
        elementInput2.sendKeys("76");
        Thread.sleep(2000);
        elementInput2.submit();
        Thread.sleep(2000);

        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);

        driver.quit();


    }
}
