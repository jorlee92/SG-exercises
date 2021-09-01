
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
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year that you were born in");
    int oldness = sc.nextInt();
    String insult = "";
    if (oldness < 2005){
        System.out.println("Pixar's 'Up' came out over a decade ago");
    }
    if (oldness < 1995){
        System.out.println("Harry potter came out over 15 years ago");
    }
    if (oldness < 1985){
        System.out.println("Space jam didnt come out last decade, the one before that");
    }
    if (oldness < 1975){
        System.out.println("Jurassic Park release is closer to the first lunar landing than it is to today");
    }
    if (oldness < 1965){
        System.out.println(" MASH TV series has been around for almost half a century!");
        
    }
    }
}
