package Class25;

import java.util.LinkedList;

public class E3ArrayListVsLinkedList {

    public static void main(String[] args) {

        long startingTime=System.currentTimeMillis();
        System.out.println(startingTime);
        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,i);



        }

        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);


    }
}
