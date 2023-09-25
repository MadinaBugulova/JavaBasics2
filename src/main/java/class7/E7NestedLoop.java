package class7;

public class E7NestedLoop {

    public static void main(String[] args) {


        for (int i = 5; i > 1; i--) {
            for (int j = i; j < 6; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
