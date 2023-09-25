package Class24;

public class E5BoxingUnBoxing {


    public static void main(String[] args) {

        int a=10;

        Integer number=new Integer (10);
        Integer number2=10;
        int d=number2.intValue(); // converting from a class to a primitive it is called unboxing
        System.out.println(d);

        Integer c=10; //autoboxing
        int f=c; // autounboxing
        System.out.println(f);

    }
}
