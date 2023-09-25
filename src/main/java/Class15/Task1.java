package Class15;

public class Task1 {
    private String address;

    public Task1(String userAddress){
        address=userAddress;
        System.out.println("Executed constructor with parameter "+ userAddress);
    }

    public Task1(){
        System.out.println("Executed constructor with NO parameters");
    }

    public static void main(String[] args) {
        new Task1();
        new Task1("Canada");
    }
}



