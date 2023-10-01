package tests;


import base.Base;

public class Customer_Log_in extends Base {
    public static void main(String[] args) {
        Base.startUp();
        //navigate to url
       navigate("http://it.microtechlimited.com/");

       //click login menue


        //click customer longin menu
        click("//li/a[@href='elogin.php']");
        //click();


    }
}
