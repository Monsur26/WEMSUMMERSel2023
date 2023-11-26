package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemoFirefox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        // maximize a screen
        driver.manage().window().maximize();

        // gets to specific web address
        driver.get("https://www.ebay.com/");

        String expectedWebpageTitle="ebay";
        String actualWebpageTitle= driver.getTitle(); // gets the title of the webpage
        System.out.println(actualWebpageTitle);

        if (expectedWebpageTitle.equals(actualWebpageTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }

        // finding and locating an element
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Shoes");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(Keys.ENTER);

       // driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        Thread.sleep(2000);

        // closing driver  driver.close() closes the currrent Tab, if that's the last Tab open, it closes the browser
        //driver.close();

        // closes the driver browser instance. ie closes the entire browser
        driver.quit();

    }
}
