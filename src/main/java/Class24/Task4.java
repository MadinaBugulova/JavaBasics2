package Class24;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");


        for( String x:words){
            System.out.println(x);
        }
        words.forEach(x-> System.out.println(x));



      /*  for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            if (word.endsWith("e")) {
                words.remove(i);
            }
        }*/
        //words.removeIf(x->x.endsWith("e"));


    }
}



