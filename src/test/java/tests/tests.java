package tests;

import base.Base;

public class tests extends Base {

    public static void main(String[] args) {
       Base.startUp();
       //click Lgin Menu
       // driver.findElement(By.xpath"//li/a[@href='elogin.php']\"").click();
        click("//li/a[@href='elogin.php']");

        //click Customer Login Menu
        // driver.findElement(By.xpath"//li/a[@href='elogin.php']\"").click();
        click("//li/a[@href='clogin.php']");

        //Enter Customer User Id
        //driver.findElement(By.xpath("//input[@name='mailvid']")),sendkeys("david@gmail.com");
        sendKeys("//input[@name='mailuid']","david@gmail.com");
       //getTextCheck("//nav/h1","MicroTech NA");
//    String logoText = Base.driver.findElement(By.xpath("//nav/h1")).getText();
//    if(logoText.equals("MicroTech NA"))
//        System.out.println("Pass");
//    else
//        System.out.println("Fail");
//        String s =Base.getText("//li[1]/a");
//        if(s.equals("MicroTech NA"))
//            System.out.println("Passw");
//        else
//            System.out.println("Fail");


    }
}
