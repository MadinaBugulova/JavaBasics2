package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {


    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer> uniqNumbers=new HashSet<>();
        uniqNumbers.add(10);
        uniqNumbers.add(20);
        uniqNumbers.add(10);
        uniqNumbers.add(10);
        System.out.println(uniqNumbers);

    }
}
