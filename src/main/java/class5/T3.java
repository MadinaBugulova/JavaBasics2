package class5;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {

        int day=5;
        if (day>=1 && day<=5) {
            System.out.println("It is a weekday");
        } else if (day==6|| day==7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid Day");
        }

    }
}
