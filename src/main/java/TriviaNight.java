
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
public class TriviaNight {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        TriviaQuestion _1 = new TriviaQuestion("How much wood would a wood chuck chuck", "1 wood", "2 woods", "3 woods", "infinite woods", "d");
        TriviaQuestion[] questions = new TriviaQuestion[]{new TriviaQuestion("How much wood would a wood chuck chuck", "1 wood", "2 woods", "3 woods", "infinite woods", "d"),
                                                      new TriviaQuestion("How many fingers am I holding up", "1", "2", "3", "5", "c"),
                                                      new TriviaQuestion("When was America founded?", "1776", "1864", "2001", "yesterday", "a")};
    
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("");
        System.out.println("FIRST QUESTION!");
        
        for (TriviaQuestion question : questions) {
            question.run();
        }
    }
    
    class TriviaQuestion {
        String qText;
        String a, b, c, d, correctAnswer;
        public TriviaQuestion(String qText, String a, String b, String c, String d, String correctAnswer){
            this.qText = qText;
            this.a= a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.correctAnswer= correctAnswer;
        }
        public void run(){
            System.out.println(qText);
            System.out.println("1. " + a + "\t 2." + b);
            System.out.println("3. " + c + "\t 4." + d);
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine().substring(0,1);
            if(userInput.equalsIgnoreCase(correctAnswer)){
                System.out.println("Correct Answer");
            } else {
                System.out.println("Wrong answer!!");
            }
        }
    }
}
