package Class23;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount b=new BankAccount
                ("Marta",125267890,1600000,"User123","Pass123","Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Madina");
        System.out.println(b.getName());
    }
}
