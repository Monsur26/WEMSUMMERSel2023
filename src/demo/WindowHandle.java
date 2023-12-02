package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.reporters.jq.Main;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/Windows/Chrome/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/popup.php");
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        String MainWindow = driver.getWindowHandle();

        WebElement clickElement = driver.findElement(By.linkText("Click Here"));

        clickElement.click();


/*        Set<String> s1= driver.getWindowHandles();
        Iterator<String> li= s1.iterator();

        if (li.hasNext()){
            String childWindow = li.next();

            if(!MainWindow.equalsIgnoreCase(childWindow)) {

                driver.switchTo().window(childWindow);
                Thread.sleep(2000);
                driver.close();

            }
        }*/

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            Thread.sleep(2000);
            driver.switchTo().window(MainWindow);
            Thread.sleep(2000);
            driver.quit();


        }
    }
}
