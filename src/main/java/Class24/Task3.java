package Class24;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Sprite");
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Juice");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {

            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
                drinks.set(i,"water");

            }

        }
        System.out.println(drinks);
    }
}
