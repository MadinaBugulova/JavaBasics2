package review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {
        for ( int i=1; i<=3; i++) {

        Scanner scanner = new Scanner ( System.in);
        System.out.println("Please Enter the name of the fruit");
        String fruit= scanner.nextLine();

        switch (fruit) {
            case "Orange":
                System.out.println(" It is usually Orange");
                break;
            case " Banana":
                System.out.println(" Yellow bananas are good");
                break;
            case " Strawberry":
                System.out.println(" I like Red Strawberries");
                break;
            case " Blue berry":
                System.out.println(" Blue berries are heart");
                break;
            default:
                System.out.println(" I don't like this fruit");

        }
        }
    }
}
