
import java.util.ArrayList;
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
public class Scratchpad {
    public static void main(String[] a){
        //Create a new scanner that will take keyboard input.
        Scanner sc = new Scanner(System.in);
        //Prompt the user for a whole number and store it in 'max'
        System.out.println("Provide an integer");
        int max = sc.nextInt();
        while(max < 0){
            
        }
        //Initialize sum
        int sum = 0;
        for(int i = 0; i <= max; i++){
            if((i % 3 == 0) || (i % 5 == 0 )){
            sum += i;
            }
        }
        System.out.println(sum);
    }
}
