
import java.util.ArrayList;
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
public class AllTheTrivia {
    public static void main(String[] args){
        ArrayList<QuestionResponsePair> alist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a question, or nothing to break; ");
            String question = sc.nextLine();
            System.out.println("Enter an answer");
            String answer = sc.nextLine();
            if(question.isBlank()){
                break;
            }
            alist.add(new QuestionResponsePair(question, answer));
        }
        
        alist.forEach(x -> {
            int randomInt = (int) Math.floor(Math.random() * alist.size());
            String factoid = alist.get(randomInt).r;
            System.out.println("\nDid you know");
            System.out.print(x.q + " => " + factoid);
        });
    }
    
}

class QuestionResponsePair {

    public String q;
    public String r;
    
    public QuestionResponsePair(String q, String r){
        this.q = q;
        this.r = r;
    }
}