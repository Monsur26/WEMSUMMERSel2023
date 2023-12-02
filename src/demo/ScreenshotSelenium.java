package demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ScreenshotSelenium {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","Driver/Windows/Chrome/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/test/delete_customer.php");
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        WebElement elementInput= driver.findElement(By.name("cusid"));
        elementInput.click();
        elementInput.sendKeys("76");

        String df = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File outfile=  screenshot.getScreenshotAs(OutputType.FILE);

        File desFile= new File("C:\\Users\\Monsu\\Selenium_WEM_2023\\ScreenShot\\Screenshot"+df+"test.png");

        FileUtils.copyFile(outfile, desFile);

        driver.quit();




    }
}
