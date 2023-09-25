package Class26;

import java.util.TreeMap;

public class T2 {

    public static void main(String[] args) {


        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Russia","Moscow");
        countries.put("Italy","Rome");
        countries.put("Canada","Ottawa");
        countries.put("Egypt","Cairo");
        countries.forEach((k,v)-> System.out.println(k+ " "+v));
        countries.forEach((k, v) -> {
            if (k.length()>5) {System.out.println(k);}
        });


    }
}
