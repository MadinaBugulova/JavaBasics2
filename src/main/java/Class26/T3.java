package Class26;

import java.util.TreeMap;

public class T3 {


    public static void main(String[] args) {

        TreeMap<Integer, String> item = new TreeMap<>();
        item.put(1234567, "TV");
        item.put(3151524, "SoundBar");
        item.put(2843754, "Printer");
        item.put(2487655, "Laptop");
        item.forEach((key,value)-> System.out.println(key+" "+value));

        System.out.println();

        var entries = item.entrySet();
        for (var e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

