
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
public class BirthStones {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int month = -1;
        while(month > 12 | month < 1){
            System.out.println("Please enter a number between 1-12 for the month");
           month = sc.nextInt();
        }
        switch(month){
            case 1: System.out.println("January = Garnet");
                    break;
            case 2: System.out.println("February = Amethyst");
                    break;
            case 3: System.out.println("March = Aquamarine");
                    break;
            case 4: System.out.println("April - Diamond");
                    break;
            case 5: System.out.println("May - Emerald");
                    break;
            case 6: System.out.println("June  = Pearl");
                    break;
            case 7: System.out.println("July = Ruby");
                    break;
            case 8: System.out.println("August = Peridot");
                    break;
            case 9: System.out.println("September = Sapphire");
                    break;
            case 10: System.out.println("October = Opal");
                    break;
            case 11: System.out.println("November = Topaz");
                    break;
            case 12: System.out.println("December = Turquose");
                    break;
        }
        
       
    }
}