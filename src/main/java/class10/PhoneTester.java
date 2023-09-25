package class10;

public class PhoneTester {

    public static void main(String[] args) {

        Phone iphoneObj=new Phone();
        iphoneObj.brand="Apple";
        iphoneObj.camera=12.3;
        iphoneObj.memory=256;
        iphoneObj.price=1099;
        iphoneObj.availability();
        iphoneObj.batteryLife();
        iphoneObj.internet();

        Phone pixelObj=new Phone();
        pixelObj.brand="Google";
        pixelObj.camera=12.5;
        pixelObj.memory=512;
        pixelObj.price=999;
        pixelObj.availability();
        pixelObj.batteryLife();
        pixelObj.internet();

        Phone samsungObj=new Phone();
        samsungObj.brand="Samsung";
        samsungObj.camera=16.5;
        samsungObj.memory=125;
        samsungObj.price=1300;
        samsungObj.availability();
        samsungObj.batteryLife();
        samsungObj.internet();


    }
}
