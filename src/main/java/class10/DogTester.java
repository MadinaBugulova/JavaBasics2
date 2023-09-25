package class10;

public class DogTester {


    public static void main(String[] args) {
        // creating an obj from the Dog class
        Dog lunasObj=new Dog();
        // assigning a value to name using lunasObj
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.weight=10;
        lunasObj.age=25;

        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);

        // we are calling teh bark method on lunasObj
        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();
    }
}
