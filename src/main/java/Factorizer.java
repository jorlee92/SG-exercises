
import java.util.ArrayList;
import java.util.HashSet;
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
public class Factorizer {
    private static HashSet<Integer> getFactors(int n){
        HashSet<Integer> values = new HashSet<>();
        for(int i = 1; i < n; i++){
            if((n % i) == 0){
                values.add(i);
            }
        }
        values.remove(n);//Remove the initial input
        return values;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int toFactor = sc.nextInt();
        System.out.println("You chose " + toFactor);
        HashSet<Integer> factors = getFactors(toFactor);
        System.out.println("The number of factors is: " + factors.size());
        int sum = factors.stream().reduce((cum, cur) -> cum + cur).get();//Potential issue?
        if(sum == toFactor){
            System.out.println("This is a perfect number");
        }
         if(factors.size() == 1){
            System.out.println("This is a prime number");
        }
        System.out.println("Factors: ");
        factors.forEach(x -> System.out.print(x + " "));
        
    }
}
