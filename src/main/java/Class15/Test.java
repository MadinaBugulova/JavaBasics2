package Class15;

public class Test {

    Test(){
        System.out.println("1");
    }
    Test(String name) {
        System.out.println("2");
    }
    Test (int age){
        System.out.println("3");

    }
    Test ( int Age, String name){
        System.out.println("4");


    }

    public static void main(String[] args) {
        Test t=new Test (25 , "Madina");
    }
}
