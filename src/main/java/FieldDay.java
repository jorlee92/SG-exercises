
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
public class FieldDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String team = "";
        String input = sc.nextLine();
        if(input.compareTo("Baggins") < 0){
            team = "Red Dragons";
        } else if (input.compareTo("Dresden") < 0) {
            team = "Dark Wizards";
        } else if (input.compareTo("Howl") < 0) {
            team = "Moving Castles";
        } else if (input.compareTo("Potter") < 0) {
            team = "Golden Snitches";
        } else if (input.compareTo("Vimes") < 0) {
            team = "Night Guards";
        } else {
            team = "Black Holes";
        }
        
        System.out.println(team);
        System.out.println("Good luck in the games");
    }
}
