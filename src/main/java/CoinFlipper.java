
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
public class CoinFlipper {
    public static void main(String[] args) {
        Random rng = new Random();
        System.out.println("Ready, Set, Flip....!!");
        System.out.print("You got ");
        if(rng.nextBoolean()){
            System.out.println("Heads!");
        } else {
            System.out.println("Tails!");
        }
    }
}
