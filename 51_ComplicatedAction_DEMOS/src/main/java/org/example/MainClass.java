package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
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



        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        WebElement link = driver.findElement(By.xpath("(//a[contains(.,'Electronics')])[2]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform(); //наведення

//        Actions actions1 = new Actions(driver);
//        Action action1 = actions.clickAndHold(link).moveToElement(link).release().build().perform();


        // WebElement element = driver.findElement(By.xpath("(//a[contains(.,'Electronics')])[2]"));
    /*
        actions.dragAndDrop(element,link).build().perform();
        actions.clickAndHold(element).moveToElement(link).release().build().perform();
        actions.doubleClick(element);
        actions.contextClick(element);
    */

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування


        driver.get("https://demoqa.com/droppable");
        WebElement dropped = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        WebElement dragme = driver.findElement(By.xpath("//div[@id='draggable']"));
        actions.clickAndHold(dragme).moveToElement(dropped).build().perform();


       // driver.close();
       // driver.quit();

    }
}
