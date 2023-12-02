package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNGDemo {
    WebDriver driver;
    public void setup(String url) {
        System.setProperty("webdriver.chrome.driver", "Driver/Windows/Chrome/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void getTitle() throws InterruptedException {
        driver.getTitle();
        Thread.sleep(2000);
    }

    public void selectDropDown() throws InterruptedException {
        WebElement webElementSelectClass= driver.findElement(By.xpath("//select[@id='select']"));

        Select select = new Select(webElementSelectClass);
        // select.selectByIndex(2);
        //select.selectByVisibleText("Bus");
        select.selectByValue("C");

        Thread.sleep(3000);
    }

    public void teardown(){driver.close();}

    @Test(priority = 2)
    public void test1() throws InterruptedException {
        setup("https://www.google.com");
        getTitle();
        teardown();
    }

    @Test (enabled = false)
    public void test2() throws InterruptedException {
        setup("file:///C:/Users/Monsu/OneDrive/Desktop/WEMSUmmerWebpage.html");
        selectDropDown();
        teardown();
    }

    }

