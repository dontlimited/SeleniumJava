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

        //lesson57
        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/51_JS/drivers/chromedriver" );
        driver = new ChromeDriver(options); //options
        driver.manage().window().maximize();

        driver.get("https://github.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        driver.findElement(By.xpath("//a[contains(.,'Sign in')]"));


        //не правильний xpath
        //пошук за файнделементС
        driver.findElements(By.xpath("//a[contains(.,'Sign in')]")).size();
        System.out.println("Size: " + driver.findElements(By.xpath("//a[contains(.,'Sign in')]")).size());

        //неіснуючий елемент
        System.out.println("Size: " + driver.findElements(By.xpath("//a[contains(.,'Log in')]")).size());


        if (driver.findElements(By.xpath("//a[contains(.,'Log in')]")).size() > 0){
            System.out.println();
            System.out.println("No such elements");
        }
        else {
            System.out.println("Can't find such element");
        }



        // driver.close();
       // driver.quit();
    }
}
