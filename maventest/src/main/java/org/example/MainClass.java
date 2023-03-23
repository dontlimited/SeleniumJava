package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {

        //important
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //


        System.setProperty("chromedriver", "/Users/maksymmatviiv/IdeaProjects/udemy/maventest/drivers/chromedriver" );
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://hard.rozetka.com.ua/ua/artline-x33v14/p313623043/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@class = 'button button--small button--link services__toggle ng-star-inserted']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/rz-additional-services/div/div/ul/li/rz-service-item/label"));


        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        System.out.println(checkboxes.size());

        if (checkboxes.size() == 4) {
            System.out.println("OK");
        }else {
            System.out.println("Fail");
        }

        /*for (int i = 0; i <= checkboxes.size() ; i++) {
            checkboxes.get(i).click();
        }*/

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }










//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        driver.findElement(By.xpath("//input[@placeholder = \"Search Wikipedia\"]")).sendKeys("Selenium Web Driver");
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();
//        System.out.println(driver.findElement(By.xpath("//input[@title='Search Wikipedia']")).getAttribute("value"));
//        driver.findElement(By.xpath("//input[@title='Search Wikipedia']")).clear();



//        driver.get("https://rozetka.com.ua/ua/");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("(//a[@href='https://bt.rozetka.com.ua/ua/'])[2]")).click();
//        WebElement link = driver.findElement(By.xpath("(//a[@href='https://bt.rozetka.com.ua/ua/refrigerators/c80125/'][contains(.,'Холодильники')])[1]"));
//        System.out.println("Шуканий елемент: "+ link.getText());
//        link.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[contains(@data-id,'Beko')]")).click();



//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[contains(.,'English (United States)')]")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("(//div[contains(.,'galego')])[9]")).click();







       /*
                        C he ck Box es
                        C he ck Box es

       if (!driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected()) {
            System.out.println("Ne");
            driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("IF = " + driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
        } else driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click(); */






        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(.,'About Wikipedia')]")).click();*/




    /*  FACEBOOK CREATING
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='_8esh']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@class,'signup_btn')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Maksym");
        driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("QWE");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("maksgg1337@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("imrobot0130303");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("maksgg1337@gmail.com");
        System.out.println("Mail is:  " + driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).getAttribute("value"));
      */






       // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("0676768512");
        //System.out.println(driver.findElement(By.xpath("//input[@id='password']")).getAttribute("password"));

//        WebElement login = driver.findElement(By.xpath("//input[@id='login_field']"));
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        login.sendKeys("test");






//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        WebElement button = driver.findElement(By.xpath("//a[@href='/login']"));
//        if (button.getText().equals("Sign in")) {
//            System.out.println("Success");
//        }else System.out.println("Fail");
//        System.out.println("Button text is: "+ button.getText());
//        button.click();


//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        WebElement create = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/a\n"));
//        create.click();

        /*driver.quit();*/
    }

   /* public static void selectRadioButton(String name){
        String rbXpath = "(//input[@type='checkbox'])[2]";

        if (!driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected()) {
            driver.findElement(By.xpath(String.format(rbXpath, name))).click();
        }
    } */

    public static void selectOption(String listName, String option){
        String listXpath = String.format("//span[@class='vRMGwf oJeWuf'][contains(.,'%s')]", listName);
        String optionXpath = String.format("//span[@class='vRMGwf oJeWuf'][contains(.,'%s')]", option);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();
    }
}
