package class5;

public class E5OrOperator {
    public static void main(String[] args) {

        boolean broughtFlowers=false;
        boolean broughtChocolates=false;
        boolean AllMyMistake=false;

        if (broughtChocolates ||broughtFlowers ||AllMyMistake) {

            System.out.println("Wife is happy");

        } else {
            System.out.println("Wife is Sad");
        }
    }
}
