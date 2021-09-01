
import java.util.Random;

public class BarelyControlledChaos {
    Random rng = new Random();
    private String[] createFiveMemberGroup(String a, String b, String c, String d, String e){
        return new String[]{a, b, c, d, e};
    }
    
    public String getRandomColor(){
        int idx = rng.nextInt(5);
        return createFiveMemberGroup("Blue", "Red", "Orange", "Black", "White")[idx];
    }
    
    public String getRandomAnimal(){
        int idx = rng.nextInt(5);
        return createFiveMemberGroup("Dog", "Cat", "Fish", "Giraffe", "Leopard")[idx];
    }
    
    public int getRandomNumberInRange(int min, int max){
        return rng.nextInt(max + min) + min;
    }
    public static void main(String[] args) {

        BarelyControlledChaos bcc = new BarelyControlledChaos();
        String color = bcc.getRandomColor();
        String animal = bcc.getRandomAnimal();
        String colorAgain = bcc.getRandomColor();
        int weight = bcc.getRandomNumberInRange(5, 200);
        int distance = bcc.getRandomNumberInRange(10, 20);
        int number = bcc.getRandomNumberInRange(10000, 20000);
        int time = bcc.getRandomNumberInRange(2, 6);
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
}
