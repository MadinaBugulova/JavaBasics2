package Class11;

public class E7StringMethods {

    public static void main(String[] args) {


        String str="GHHTYIU2hgfdas34464780%^^&*(($$#";
        System.out.println(str.replaceAll( "[A-Z]", "="));
        System.out.println(str.replaceAll("[A-C]", "="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]",""));

    }
}
