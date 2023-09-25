package Class26;

import java.util.TreeMap;

public class E4Maps {


    public static void main(String[] args) {


        TreeMap<String,Double> makeup= new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOn",40.0);
        makeup.put("Base",50.0);
        makeup.put("Foundation",90.0);
        makeup.put("EyeLiner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("EyeLiner",25.5);
        //makeUp.forEach((key,value)-> System.out.println(key+" "+value));
        // Bothkeys and values
        //makeup.forEach((k,v)-> System.out.println(k+" "+v));
        // print only keys
        //makeup.forEach((k,v)-> System.out.println(v));
        // print only values
        //makeup.forEach((k,v)-> System.out.println(k));
        makeup.forEach((k,v)->{
            if(k.contains("a")){
                System.out.println(v);
            }
        });





    }


}
