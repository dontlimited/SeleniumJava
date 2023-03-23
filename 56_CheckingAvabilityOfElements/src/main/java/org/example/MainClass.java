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

        //lesson56
        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/51_JS/drivers/chromedriver" );
        driver = new ChromeDriver(options); //options
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/webtables");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        WebElement button1 = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));


        System.out.println("button add: "+ button1.isEnabled());
        if (button1.isEnabled()) {
            button1.click();
        }


        driver.get("https://hard.rozetka.com.ua/ua/artline-x33v14/p313623043/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування
        driver.findElement(By.xpath("//label[@for='Windows 11']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement wnd =  driver.findElement(By.xpath("//label[@for='Windows 11']"));

        System.out.println(wnd.isSelected());

        if (!wnd.isSelected()) wnd.click();
        System.out.println(wnd.isSelected());

       // driver.close();
       // driver.quit();

    }
}
