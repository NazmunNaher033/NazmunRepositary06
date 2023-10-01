package tests;

import base.Base;

public class Varify_HomeMenuText extends Base {
    public static void main(String[] args) {
      Base.startUp();
      Base.navigate("http://it.microtechlimited.com/");

      String s =Base.getText("//li[1]/a");
      if(s.equals("Home"))
          System.out.println("Passw");
      else
          System.out.println("Fail");

    }
}
