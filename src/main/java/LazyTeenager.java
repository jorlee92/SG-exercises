
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
public class LazyTeenager {
    public static void main(String[] args) {
        Random rng  = new Random();
        int timesWarned = 0;
        int randomNumber = -1;
        int ceil = 10;
        do {            
            timesWarned += 1;
            ceil -= 1;
            System.out.println("Clean your room!! (x" + timesWarned + ")");
            randomNumber = rng.nextInt(ceil);
            
        } while (randomNumber != 1);
        System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
    }
}
