package Class16;

public class Cat {

    private String name;
    private int age;
    private double weight;
    private String color;

    public Cat(){

    }
    public Cat( String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;

    }

    public Cat (String name,int age, double weight, String color){

        this ( name, age, weight);
        this.color=color;
    }
    public void printInfo(){

        System.out.println(name+" "+age+" "+weight+" "+color);
    }
}
