package Class16;

public class PersonTester {
    public static void main(String[] args) {

        Person p1=new Person("Fahim",
                26,85,
                'M');
        p1.printInfo();

        Person p2=new Person("Fatima",
                39,15,
                'W',100000,
                "Blonde");
        p2.printInfo();
    }
}
