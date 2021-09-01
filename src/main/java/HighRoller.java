/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(6) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        if (rollResult == 2) {
            System.out.println("You rolled a low result");
        }
        if (rollResult == 3) {
            System.out.println("You rolled a middling result");
        }
        if (rollResult == 4) {
            System.out.println("You rolled above average!");
        }
        if (rollResult == 5) {
            System.out.println("Pretty good");
        }
        if (rollResult == 6) {
            System.out.println("Perfect");
        }        
        
    }
}