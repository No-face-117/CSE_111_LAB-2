// CSE-111 LAB-2 UG TASK-3     []
// Bird object

import java.util.Scanner;

public class ChickenBurger {
    public String bun = "Sesame.";
    public int price = 200;
    public String sauceOption = "Less.";
    public String spiceLevel = "Not Set !";

    public String customizeSpiceLevel(String nk){
        if (nk.equals("Mild") || nk.equals("Spicy") || nk.equals("Naga")) {
            System.out.println("Spice level set to " + nk + ".");
            spiceLevel = nk;
        }
        else{System.out.println("This spice level is unavailable.");}
        
        return spiceLevel;
    }

    public String serveBurger(){
        String nk;
        if (spiceLevel.equals("Not Set !")) {
            nk = "Cannot serve now. Customize Spice Level first.";
        }
        else{
            nk = "The burger is being served : - " + "\n" + "Bun Type : " + bun + "\n" + "Price : " + price + " TK!" + "\n" + "Sauce Option : " + sauceOption + "\n" + "Spice Level : " + spiceLevel;
        }

        return nk;
    }
}
 

