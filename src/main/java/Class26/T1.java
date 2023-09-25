package Class26;

import java.util.LinkedHashMap;

public class T1 {

    public static void main(String[] args) {


        LinkedHashMap<Integer,String> companyName= new LinkedHashMap<>();
        companyName.put(1,"Google");
        companyName.put(2,"Syntax");
        companyName.put(3,"Facebook");
        companyName.put(3,"Amazon");
        companyName.put(4,"Twitter");
        companyName.put(5,"Netflix");
        companyName.put(7,"Syntax");
        System.out.println(companyName);
        System.out.println("Company Size: "+companyName.size());
        System.out.println("Company replaced: "+companyName.replace(4,"Apple"));
        System.out.println("Company removed: "+companyName.remove(7));

        System.out.println("Updated companyName "+companyName);

    }

}
