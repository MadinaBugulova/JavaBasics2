package class5;

import java.util.Scanner;

public class T5 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println(" Enter your country");
         String country= scanner.nextLine();

         switch (country) {
             case "Russia":
                 System.out.println("Russian");
                 break;

              case "Italy":
                  System.out.println("Italian");
                  break;
               case "Spain":
                   System.out.println("Spanish");
                   break;

                case "United States":
                    System.out.println("english");
                    break;
             default:
                 System.out.println("country not supported");

            }

           }
          }

