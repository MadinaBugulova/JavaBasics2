package Project0;

public class T10 {
    public static void main(String[] args) {
        studentA a = new studentA(50,60,70);
        System.out.println(a.getPercentage()+" average rating of the Student A");
        studentB b = new studentB(75,80,85,90);
        System.out.println(b.getPercentage()+" average rating of the Student B");
    }
}
abstract class  Marks {
    public abstract double getPercentage();
}
class studentA extends Marks{
    int mark1, mark2, mark3;
    studentA(int mark1, int mark2, int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public double getPercentage(){
        double total=(mark1+mark2+mark3)/(double)3;
        return total;
    }
}
class studentB extends Marks{
    int mark1, mark2, mark3, mark4;
    studentB(int mark1, int mark2, int mark3, int mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }
    public double getPercentage(){
        double total=(mark1+mark2+mark3+mark4)/(double)4;

        return total;
    }
}

