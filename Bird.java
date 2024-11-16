// CSE-111 LAB-2 UG TASK-2     []
// Bird object

import java.util.Scanner;

public class Bird {
    public String name;
    public String noise;
    public int up;
    public int down;

    public int flyUp(int ak){
        up += ak;

        System.out.println(name + " has flown up " + up + " feet.");
        return up;
    }

    public int flyDown(int pk){
        if (pk > up) {
            System.out.println(name + " cannot fly down " + pk + " feet.");
        }
        else if (pk < up) {
            System.out.println(name + " has flown down " + pk + " feet.");
            up -= pk;
        }
        else if (pk == up) {
            System.out.println(name + " has flown down " + pk + " feet and landed.");
        }
        else{}
        return up;
    }

    /*
    public void makeNoise(){
    Scanner scan = new Scanner(System.in);

    System.out.println("IDK what noise a " + name + " makes !");

    System.out.println("Enter the noise that a " + name + " makes.");
    noise = scan.nextLine();

    System.out.println();
    System.out.println("!!! " + noise + " !!!");
    }
     */
    
}
 

