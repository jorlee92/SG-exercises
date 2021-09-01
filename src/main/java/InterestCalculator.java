
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
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an initial principal");
        double initialPrincipal = sc.nextDouble();
        System.out.println("Enter an annual interest rate");
        double apr = sc.nextDouble();
        System.out.println("Enter a number of years to invest");
        int years = sc.nextInt();
        
        for(int i = 0; i < years * 4; i++){
           double amountToAdd = (initialPrincipal * (1 + ((apr / 4) / 100))) - initialPrincipal;
           if(i % 4 == 0 && i != 0){
               System.out.println("Interest earned this year " + amountToAdd);
               System.out.println("You started with " + initialPrincipal);
               System.out.println("Your new balance is " + initialPrincipal + amountToAdd);
               initialPrincipal += amountToAdd;
           }
        }
    }
}
