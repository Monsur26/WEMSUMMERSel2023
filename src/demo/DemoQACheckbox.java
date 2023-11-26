package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoQACheckbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

       // open demoqa elements
        driver.findElement(By.xpath("//li[@id=\"item-1\"]/span[text()='Check Box']")).click();
        Thread.sleep(1000);
        // click on the check box
        driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]")).click();
        Thread.sleep(1000);


        // validate message after successfully clicking checkbox
       String actualText = driver.findElement(By.xpath("//span[text()=\"You have selected :\"]")).getText();
       String expectedText = "You have selected :";

        if (expectedText.equals(actualText)) {
            System.out.println("Validation completed");
        } else {
            System.out.println("Validation failed");
        }
        Thread.sleep(1000);
        driver.quit();



    }
}
