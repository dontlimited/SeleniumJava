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

        driver.get("https://demoqa.com/browser-windows");
        String mainWindow = driver.getWindowHandle(); //оголошення 1 відкритого вікна
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();

        for (String windowHandle:driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);   // переключення на останнє вікно
        }
        WebElement window = driver.findElement(By.xpath("//h1[contains(@id,'sampleHeading')]"));
        if (window.getText().equals("This is a sample page")) {
            System.out.println("True");
        }else System.out.println("False");



        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //–– неявні очікування

        driver.switchTo().window(mainWindow); //повертаємось до основного вікна
        WebElement NewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        System.out.println("Main: " + NewTab.getText());

       // driver.close();
       // driver.quit();

    }
}
