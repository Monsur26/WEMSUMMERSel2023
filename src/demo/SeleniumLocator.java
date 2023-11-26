package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/Windows/GeckoDriver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("file:///C:/Users/Monsu/OneDrive/Desktop/WEMSUmmerWebpage.html");
        driver.manage().window().maximize();

      String text =  driver.findElement(By.id("p1")).getText();
        System.out.println("the return is through ID attribute : "+ "\""+ text + "\"");

      String secondText= driver.findElement(By.className("p2")).getText();
        System.out.println("The second text through ClassName is : "+ "\""+ secondText+"\"");

     //   driver.findElement(By.id("name")).sendKeys("JHbjj");
     int numberOFInputFields=  driver.findElements(By.tagName("input")).size();
        System.out.println("Number of input fields "+ "\"" + numberOFInputFields + "\"");


        // Link Text
    /* driver.findElement(By.linkText("click here to go to ebay")).click();
    Thread.sleep(1000);*/

        //Partial Link text
        driver.findElement(By.partialLinkText("go to ebay")).click();
        Thread.sleep(1000);



    driver.quit();
    }
}
