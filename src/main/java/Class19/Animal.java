package Class19;

public class Animal {

   private String name;
    private String color;
    private int age;

    int num=10;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void printInfo(){
        System.out.println(name+ " "+color+" "+age);
    }
}
class Dog extends Animal{


    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void printInfo(){

        System.out.println("My own method");
    }
}