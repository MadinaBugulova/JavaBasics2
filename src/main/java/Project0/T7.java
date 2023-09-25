package Project0;

import java.util.ArrayList;
import java.util.List;

public class T7 {
    public static void main(String[] args) {

        List<String> word=new ArrayList<>();
        word.add("Artur");
        word.add("Madina");
        word.add("Atlanta");
        word.add("Asghar");
        word.add("Asel");
        word.add("Ehab");
        word.removeIf(x->!x.startsWith("A"));
        System.out.println(word);
        for(int i=0,j=word.size();i<j;++i){
            System.out.print(word.remove(0).toLowerCase()+" ");
        }

    }
}
