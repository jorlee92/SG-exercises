
import java.util.Random;
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
public class DogGenetics {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your dogs name ");
        String dogName = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        int total = 100;
        int a = rand.nextInt(total);
        System.out.println("Your dog is " + a + " % schnauzer");
        total = total - a;
        
        int b = rand.nextInt(total);
        System.out.println("Your dog is " + b + "% doberman");
        total = total - b;
        
        
        int c = rand.nextInt(total);
        System.out.println("Your dog is " + c + "% pices");
        total = total - c;
        
        int d = rand.nextInt(total);
        System.out.println("Your dog is " + d + "% shitzu");
        total = total - d;
        System.out.println("Your dog is " + total + " % human");
    }
}
