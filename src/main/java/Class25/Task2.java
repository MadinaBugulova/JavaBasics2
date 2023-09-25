package Class25;

import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {

        TreeSet<String> countries= new TreeSet<>();

        countries.add("Russia");
        countries.add("Romania");
        countries.add("USA");
        countries.add("Georgia");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Italy");
        countries.add("France");
        countries.add("Australia");
        countries.add("New Zealand");
        System.out.println(countries);
        System.out.println();
        for(String c:countries){
            System.out.println(c);
        }
        countries.forEach(x-> System.out.println(x));
    }
}
