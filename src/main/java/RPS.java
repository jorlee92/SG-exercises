
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
public class RPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        String ans;
        boolean repeatProcess = false;
        do {
            int userWins = 0;
            int pcWins = 0;
            int gameTies = 0;
            System.out.println("How many rounds would you like to play? ");
            int rounds = sc.nextInt();
            if (rounds > 10 | rounds < 1) {
                System.out.println("Invalid number of rounds");
                System.exit(1);
            }
            while (rounds > 0) {
                System.out.println("Player one enter your choice R = 1 P = 2 S = 3");
                int p1Choice = sc.nextInt();
                sc.nextLine();
                int random = rng.nextInt(3) + 1;
                if (p1Choice == random) {
                    System.out.println("It was a tie");
                    gameTies = gameTies + 1;
                }
                if (p1Choice == 1 && random == 3) {
                    userWins++;
                } else if (p1Choice == 2 && random == 3) {
                    pcWins++;
                } else if (random == 2 && p1Choice == 1) {
                    userWins++;
                } else if (random == 2 && p1Choice == 3) {
                    pcWins++;
                } else if (random == 1 && p1Choice == 2) {
                    userWins++;
                } else if (random == 1 && p1Choice == 3) {
                    pcWins++;
                }
                rounds--;
            }

            System.out.println("PC Wins " + pcWins);
            System.out.println("User Wins " + userWins);
            System.out.println("Ties " + gameTies);

            System.out.println("Would you like to play again? ");
            ans = sc.nextLine();
            if (ans.toLowerCase().contains("y")) {
                repeatProcess = true;
            } else {
                repeatProcess = false;
            }
        } while (repeatProcess);

    }
}
