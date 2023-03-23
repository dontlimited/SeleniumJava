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


        //lesson54

        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/51_JS/drivers/chromedriver" );
        driver = new ChromeDriver(options); //options
        driver.manage().window().maximize();

        driver.get("https://signup.live.com/?lic=1");
        String mainTab = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@id='privacy']")).click();

        for(String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }

        driver.findElement(By.xpath("(//a[@class='mscom-link'])[1]")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування
        driver.switchTo().window(mainTab);
        driver.findElement(By.xpath("//input[@id='MemberName']")).sendKeys("TEST");
       // driver.close();
       // driver.quit();

    }
}
