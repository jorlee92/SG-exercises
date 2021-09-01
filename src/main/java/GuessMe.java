
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
public class GuessMe {
    public static void main(String[] args) {
        int toBeGuessed = 10404;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number ");
        int guess = sc.nextInt();
        
        if(guess < toBeGuessed){
            System.out.println("Ha, nice try - too low! I chose " + toBeGuessed);
        } else if (guess > toBeGuessed){
            System.out.println("Too high, I guessed " + toBeGuessed);
        } else {
            System.out.println("Correct, right on the money.");
        }
    }
}
