package class5;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner (System.in);
        String birthMonth=scanner.next();
        if(birthMonth.equalsIgnoreCase("mar")||
           birthMonth.equalsIgnoreCase("apr")||
           birthMonth.equalsIgnoreCase("may")

    ){
            System.out.println("Spring");


        }else if (birthMonth.equalsIgnoreCase("june")||
                birthMonth.equalsIgnoreCase("july")||
                birthMonth.equalsIgnoreCase("august")
        ){

            System.out.println("Summer");
        }




    }
}
