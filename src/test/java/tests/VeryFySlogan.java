package tests;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VeryFySlogan extends Base {
    public static void main(String[] args) {
        startUp();
        navigate("http://it.microtechlimited.com/");

       WebElement pagsloganElement = driver.findElement(By.xpath("//p"));
        String pageSloganText = pagsloganElement.getText();

        if(pageSloganText.equals("Your One Stop Soloution"))
            System.out.println("pass");
        else
            System.out.println("Fail");

    }
}
