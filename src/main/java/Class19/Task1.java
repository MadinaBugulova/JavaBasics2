package Class19;

public class Task1 {

    public int min(int num1, int num2) {

        // return num1>num2?num1:num2; ternary operator
        //internally operator another method of writing if condition
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }


    }

    public double min(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}