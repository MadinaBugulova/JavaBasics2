package Class24;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(100);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println();
        int sum = 0;
        for (Integer n : numbers) {
            if (n > 20) {
                sum += n; // sum=sum+n
            }

        }
            System.out.println(sum);

    }
}