package Class21;

public abstract class Animal {

    String name;
    String breed;
    String color;

   abstract void speak();
    abstract void sleep();
    abstract void eat();
            }
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff wuff...");

    }

    @Override
    void sleep() {
        System.out.println("Sleeping for last 10 hours....");
    }

    @Override
    void eat() {
        System.out.println("Eating bones");
    }
}
class Cat extends Animal{


    @Override
    void speak() {
        System.out.println("Meow meow...");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours");
    }

    @Override
    void eat() {
        System.out.println("Like to eat fish...");
    }
}