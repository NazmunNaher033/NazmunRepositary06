package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;


    public static void startUp() {
        WebDriverManager.chromedriver().setup();
        ;
        //webdriver driver
        driver = new ChromeDriver();
    }
    public static void navigate(String url ){
        driver.get(url);


    }
    public static void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public static void sendKeys(String xpath, String keys){
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }
    public static String getText(String xpath){
        String s = driver.findElement(By.xpath(xpath)).getText();
        return  s;
    }
//    public static void click(By locator){
//        driver.findElement(locator).click();
//    }
//    public static void sendkeys(By locator,String keys){
//
//    }
//   // public static void
//    public static String getText(By locator){
//        String s = driver.findElement(locator).getText();
//        return s;
    // }
}
