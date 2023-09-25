package class10;

import javax.imageio.stream.ImageInputStream;

public class Student {
    //Properties/Attributes
    String name;
    int age;
    String id;
    //Methods/functions/Behaviours

    void study (){

        System.out.println(" Studying 16 hours a day........");

    }

    public static void main(String[] args) {


        Student EhabObj=new Student();
        EhabObj.name="Ehab";
        EhabObj.age=23;
        EhabObj.id="abc123";
        EhabObj.study(); // scanner.nextInt();


        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="abd123";
        habibObj.study();



    }


    }

