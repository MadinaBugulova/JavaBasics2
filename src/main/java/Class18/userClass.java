package Class18;

public class userClass {
    String name;
    String mobileNumber;



    public userClass(String name,String mobileNumber){

        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    void printInfo(){
        System.out.println(name+" "+mobileNumber);
    }
}
class userInfo extends userClass{
    String address;

    public userInfo(String name,String mobileNumber, String address){
        super (name, mobileNumber);
        this.address=address;
    }
    void printInfo(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }


}
