package Class15;

public class Dog {


    private String name;
    private String breed;
    private String color;
    private int age;

    public Dog(String dName, String dBreed, String dColor,
        int dAge){

        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;

        if (dAge<0 || dAge>30){

            System.out.println("Not allowed");
        } else{
            age=dAge;
        }

    }


    public void bark(){

        System.out.println("wuff wuff....");
    }
    public void printInfo(){
        System.out.println(name+" "+breed+" "+color);

    }
}
