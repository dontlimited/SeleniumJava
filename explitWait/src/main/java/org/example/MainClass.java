package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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


        //lesson50

        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/explitWait/drivers/chromedriver" );
        driver = new ChromeDriver(options); //options
        driver.manage().window().maximize();


        //     явні очікування
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Duration duration = Duration.ofSeconds(5);
        wait = new WebDriverWait(driver,duration);

        WebDriverWait wait2 = (new WebDriverWait(driver, Duration.ofSeconds(3)));
        
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=UA&continue=https%3A%2F%2Fwww.google.com.ua%2F&dsh=S-637493889%3A1678851694903051&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&authuser=0");



        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); –– неявні очікування

        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstName']")));

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TEST");
        //driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("TEST");



        driver.findElement(By.xpath("//div[@jsname='oYxtQd']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-value='en-GB']")));
        driver.findElement(By.xpath("//li[@data-value='en-GB']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//li[@data-value='en-GB']")));



    }
}
