
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
public class DoItBetter {
    
    public static void main(String[] args){
        String[] feats = new String[]{"How many pushups can you do?", "How many cookies can you eat?", "How many cars do you have?"};
        for(int i = 0; i < feats.length; i++){
            System.out.println(feats[i]);
            Scanner sc = new Scanner(System.in);
            int featCount = sc.nextInt();
            
            System.out.println("Oh yeah, well I can do " + ((featCount * 2) + 1));
        }
    }
    
}
