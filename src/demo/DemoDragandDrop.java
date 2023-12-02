package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoDragandDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        // Action class object to create and access action class methods and functions
        Actions actions=new Actions(driver);

        WebElement dragElement= driver.findElement(By.xpath("//a[@class='button button-orange' and contains(text(),\" BANK \")]"));
        WebElement targetElement= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(dragElement));


        actions.dragAndDrop(dragElement,targetElement).build().perform();
        Thread.sleep(2000);

        driver.quit();

    }
}
