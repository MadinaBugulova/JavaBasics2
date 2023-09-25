package class9;

public class T1DArrays {

    public static void main(String[] args) {


        String [][] cars = {
                {"Dodge","Chevy", "Ford"},
                {"BMW","Mercedes","VW"},
                {"KIA","Hyundai","Genesis"},
                {"Ferrari","Alfa Romeo","Maserati"},
        };

        for (String [] r:cars){
            for ( String c:r){

                System.out.print( c+" ");
            }
            System.out.println();

        }

        System.out.println("===================");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.println(cars[i][j]+ " ");


            }
            System.out.println();

        }
    }
}
