package Class19;

public class Programming {
    //a method is a block of code that, when called, performs specific actions mentioned in it.

    public Programming() {
        System.out.println("I love programming languages");


    }

    public Programming(String word) {
        System.out.println("I love " + word);
    }

    public static void main(String[] args) {
        new Programming("Java");

    }
}