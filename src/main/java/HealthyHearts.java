
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
public class HealthyHearts {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int uAge = sc.nextInt();
        System.out.println("Your maximum heart rate should be " + (220 - uAge) + "bpm");
        System.out.println("Your target HR Zone is " + ((220 - uAge) * 50) + " " + ((220 - uAge) * 85));
    }
}
