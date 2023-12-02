package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FRameHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("https://demoqa.com/frames");
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        String ParentTitle= driver.getTitle();

        System.out.println(ParentTitle +"\n ***************" );

        WebElement frameElement= driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frameElement);
        String headerText = driver.findElement(By.tagName("h1")).getText();

        System.out.println(headerText);

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
