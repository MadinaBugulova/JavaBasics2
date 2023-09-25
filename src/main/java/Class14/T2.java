package Class14;

public class T2 {

    public static void main(String[] args) {
        T2 t2=new T2();
        int [] array={10,20,25};
        System.out.println(t2.getArrSum(array));
    }

    int getArrSum(int [] arr){
       int sum=0;
       for(int n:arr){
           sum=sum+n;
       }
       return sum;
    }
}
