package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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



        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=UA&continue=https%3A%2F%2Fwww.google.com.ua%2F&dsh=S-637493889%3A1678851694903051&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&authuser=0");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //–– неявні очікування
        firstname.sendKeys("Test");
        lastname.sendKeys("Lastname");


        // driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TEST");


        driver.close();
        driver.quit();

    }
}
