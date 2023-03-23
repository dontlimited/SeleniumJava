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
        driver.get("https://demoqa.com/alerts");


        WebElement button = driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
        button.click();
        // pause na 3 sec
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.switchTo().alert().accept(); // нажимає окей)


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.get("https://google.com");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("confirm('Are you okay?');");
        driver.switchTo().alert().accept(); // нажимає окей)



        // driver.switchTo().alert().dismiss(); //нажимає неокей;



        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //–– неявні очікування




       // driver.close();
       // driver.quit();

    }
}
