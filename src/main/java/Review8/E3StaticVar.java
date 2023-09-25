package Review8;

public class E3StaticVar {

    public static String country="US";

    void printName(){

        System.out.println(country);

    }

     static void printCountry() {
         System.out.println(country);

    }

}

class StaticTester extends E3StaticVar{
    public static void main(String[] args) {
        System.out.println(country);
       // Math.
    }


}
