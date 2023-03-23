package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;


public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {

        //important
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //


        //lesson51

        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/51_JS/drivers/chromedriver" );
        driver = new ChromeDriver(options); //options
        driver.manage().window().maximize();
        driver.get("http://en.wikipedia.org");

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("window.scrollBy(0, 1500)", ""); //скрол вниз

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        jse.executeScript("window.scrollBy(0, -1500)", ""); //скрол назад

        JavascriptExecutor alert = (JavascriptExecutor)driver;
        alert.executeScript("alert('Hello')");




        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування




       // driver.close();
       // driver.quit();

    }
}
