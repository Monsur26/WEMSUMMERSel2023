package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragandDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        // Action class object to create and access action class methods and functions
        Actions actions=new Actions(driver);

        WebElement dragElement= driver.findElement(By.xpath("//a[@class='button button-orange' and contains(text(),\" BANK \")]"));
        WebElement targetElement= driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));

        actions.dragAndDrop(dragElement,targetElement).build().perform();
        Thread.sleep(2000);

        driver.quit();



    }
}
