package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DemoQAACTIONClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));

        // Action class object to create and access action class methods and functions
        Actions actions=new Actions(driver);
        actions.doubleClick(doubleClickBtn).build().perform();

        Thread.sleep(1000);

        WebElement doubleClickMsg = driver.findElement(By.id("doubleClickMessage"));

            String actualTextDbl = doubleClickMsg.getText();
            String expectedTextDbl = "You have done a  click";
            Assert.assertEquals(actualTextDbl, expectedTextDbl, "Assertion failed");

        //right click
        WebElement rightClickBtn= driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).build().perform();

        WebElement rightClickMsg = driver.findElement(By.id("rightClickMessage"));
        String actualTextrht=rightClickMsg.getText();
        String expectedTextrht="You have done a right click";

        Assert.assertEquals(actualTextrht,expectedTextrht,"Assertion Failed");



        driver.quit();
    }
}
