package Class24;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<String> carMarks = new ArrayList<>();
        carMarks.add("BMW");
        carMarks.add("Tesla");
        carMarks.add("Audi");
        carMarks.add("Honda");
        System.out.println(carMarks);

        for (int i = 0; i < carMarks.size(); i++) {
            System.out.println(carMarks.get(i));
        }
        System.out.println("*********");
        for(String n:carMarks){

            System.out.println(n);
        }

        System.out.println("******************");

        int i=0;
        while(i<carMarks.size()){

            System.out.println(carMarks.get(i));
            i++;
            //i++ increment
        }

    }




}
