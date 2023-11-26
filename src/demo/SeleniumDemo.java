package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {
    public static void main(String[] args) {

        // sets the property to interact with browser
        System.setProperty("webdriver.chrome.driver","Driver/Windows/Chrome/chromedriver-win64/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");


        // Create an object of specific webdriver of a specific browser
        WebDriver driver= new ChromeDriver(options);

        driver.get("https://www.ebay.com/");


    }
}
