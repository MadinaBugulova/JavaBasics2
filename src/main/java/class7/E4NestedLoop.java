package class7;

public class E4NestedLoop {

    public static void main(String[] args) {


        for (int j = 0; j < 5; j++) {
            for (int i = 2; i < 20; i=i+2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}