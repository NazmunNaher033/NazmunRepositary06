package tests;

import base.Base;

public class Varrify_PageName extends Base {
;

    public static void main(String[] args) {

        //verify page name "Microtech"
        // WebDriver driver;
        Base.startUp();
        Base.navigate("http://it.microtechlimited.com/");
        String s =Base.getText("//li[1]/a");
        if(s.equals("MicroTech NA"))
            System.out.println("Passw");
        else
            System.out.println("Fail");

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://it.microtechlimited.com");
//
//       WebElement pageHeadingElement = driver.findElement(By.xpath("//div/h1"));
//       String headingElementText = pageHeadingElement.getText();

       // System.out.println("heading is = " + headingElementText);
       //System.out.println(headingElementText.equals("Welcome to MicroTech NA."));
//      if (headingElementText.equals("Welcome to MicroTech NA."))
//           System.out.println("pass");
//
//        else
//            System.out.println("Fail");
    }//main
//   public static void startUp(){
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://it.microtechlimited.com");
//
//
//
//    }
}
