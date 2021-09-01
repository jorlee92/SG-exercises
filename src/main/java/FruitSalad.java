public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        int idx = 0;
        int allowedApplesRemaining = 3;
        int allowedOrangesRemaining = 2;
        for (String f: fruit){
            if(idx > 11){
                break;
            }
            if(f.toLowerCase().contains("berry")){
                fruitSalad[idx] = f;
                idx++;
            } else if (allowedApplesRemaining > 0 && f.toLowerCase().contains("apple")){
                fruitSalad[idx] = f;
                allowedApplesRemaining--;
                idx++;
            }
                else if (allowedOrangesRemaining > 0 && f.toLowerCase().contains("orange")){
                fruitSalad[idx] = f;
                allowedOrangesRemaining--;
                idx++;
            } else if (f.toLowerCase().contains("tomato")){
                //Purposefully do nothing.
            } else {
                fruitSalad[idx] = f;
                idx++;
            }    
            
        }

        for(String s: fruitSalad){
            System.out.println(s);
        }
    }
}