
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
public class LuckySevens {
    public static void main(String[] args) {
        Random rng = new Random();
        System.out.println("How much do you want to gamble ");
        int maxMoney = 0;
        int itercount =0;
        int maxIterCount = 0;
        Scanner sc = new Scanner(System.in);
        int dollars = sc.nextInt();
        while(dollars > 0){
            int d1 = rng.nextInt(6) + 1;
            int d2 = rng.nextInt(6) + 1;
            
            if(d1 + d2 == 7) {
                dollars += 4;
            } else {
                dollars --;
            }
            if(dollars > maxMoney){
                maxMoney = dollars;
                maxIterCount = itercount;
            }
            itercount++;
        }
        System.out.println("You went broke after " + itercount + " rolls");
        System.out.println("Should have stopped at " + maxIterCount + " when you had " + maxMoney);
    }
    
    
}
