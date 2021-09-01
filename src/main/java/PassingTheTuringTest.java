
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
public class PassingTheTuringTest {
    
    public static void main(String[] args){
        System.out.println("Hello There \nWhat's your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        System.out.println("Hi, " + name + "! I'm Jordan");
        System.out.println("What is your favorit color? ");
        String favColor = sc.nextLine();
        
        System.out.println(favColor + " huh? Mines Electric Lime");
        
        System.out.println("I really like limes. They're my favorite fruit too");
        System.out.println("What is your favorite fruit " + name);
        
        String favFruit = sc.nextLine();
        System.out.println("Really? " + favFruit + " ? Thats crazy!");
        
        System.out.println("Speaking of favorites, what is your favorite  number?");
        
        String favNumber = sc.nextLine();
        
        System.out.println(favNumber + " is a cool number. Mine's -7");
        double result = Double.parseDouble(favNumber) * -7;
        
        System.out.println("Did you know " + favNumber + " * -7 is " + result);
        
        System.out.println("Thats a cool number too!");
        
        System.out.println("Well thanks for talking to me " + name);

    }
}
