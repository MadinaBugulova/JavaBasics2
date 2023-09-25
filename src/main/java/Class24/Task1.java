package Class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Artur");
        names.add("Madina");
        names.add("Ehab");
        names.add("Ayesha");
        names.add("Abi");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Madina"));
        System.out.println(names.size());
        System.out.println(names);
    }
}