package tests;

import base.Base;

public class Verify_EmployeeLogin extends Base {
    public static void main(String[] args) throws InterruptedException {
        startUp();

        //click login menu
        click("//a[@href='elogin.php']");
        Thread.sleep(400);
        //click employee login menu
        click("//input[@name='mailuid']");
        Thread.sleep(400);
        //enter employee user id
        // sendKeys(, "testpilot@gmail.com");
        Thread.sleep(400);
        // sendKeys(By.name("pwd"), "1234");
        click("//input[@name'\"login-submit']");


    }

}
