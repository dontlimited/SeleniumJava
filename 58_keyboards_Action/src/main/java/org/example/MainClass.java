package org.example;

import org.openqa.selenium.*;
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

        //lesson58
        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/51_JS/drivers/chromedriver" );
        driver = new ChromeDriver(options); //options
        driver.manage().window().maximize();

        driver.get("https://hard.rozetka.com.ua/ua/artline-x33v14/p313623043/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        searchInput.sendKeys("соки");
        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "orange"));
       // searchInput.sendKeys(Keys.ENTER);

        String select = Keys.chord(Keys.COMMAND, "a");
        String cut = Keys.chord(Keys.COMMAND, "x");
        String paste = Keys.chord(Keys.COMMAND, "v");

        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        searchInput.sendKeys(paste);

        // driver.close();
       // driver.quit();
    }
}
