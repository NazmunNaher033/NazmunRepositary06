package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class Main {
    public static void main(String[] args) {
        //verify Landing Heading Text is "Welcome to MicroTech NA"
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://it.microtechlimited.com");
        WebElement pageHeadingElement= driver.findElement(By.xpath("//div/h1"));
        String headingElementText= pageHeadingElement.getText();
        System.out.println("heading is = "+headingElementText);
        if (headingElementText.equals("welcome to MicroTach NA."))
        System.out.println("pass");
        else
        System.out.println("Fail");

        //verify Landing Heading Text is "Your on Stop Soluation "
        WebDriver driver2;
        WebDriverManager.chromedriver().setup();
        driver2 = new ChromeDriver();
        driver2.get("http://it.microtechlimited.com");
        WebElement pageSloganElement=  driver2.findElement(By.xpath("//p"));
        String pageSloganText= pageSloganElement.getText();
        //System.out.println("");
        if (pageSloganText.equals("Your on Stop Soluation "))
            System.out.println("pass");
        else
            System.out.println("Fail");


    }

}