/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
public class MenuOfChampions {

    public static void main(String[] args){
        FoodItem pizza = new FoodItem("Pizza", 5.0);
        FoodItem grapes = new FoodItem("Grapes", 2.2);
        FoodItem candyBar = new FoodItem("Candy Bar", 0.5);
    
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.");
        System.out.println("Welcone to St. Jordans");
        
        System.out.println("Todays Menu Is:");
        FoodItem[] arr = new FoodItem[]{pizza, grapes, candyBar};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}

class FoodItem {
    String type;
    Double price;
    
    public String toString(){
        return "\t " + this.type + " for only " + this.price;
    }
    public FoodItem(String type, double price){
        this.type = type;
        this.price = price;
    }
}