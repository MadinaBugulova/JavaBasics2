package Class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();

        // syntax for specifying the data type-String

        names.add("Deepali");
        names.add("Artur");
        names.add("Madina");
        names.add("Ehab");
        names.add("Ayesha");
       // names.remove(0);
        names.remove("Deepali");
        System.out.println(names);
        names.add(2,"Mila");
        System.out.println(names);
        names.set(1,"Ayesha");
        System.out.println(names);

    }
}
