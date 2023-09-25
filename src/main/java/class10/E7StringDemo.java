package class10;

public class E7StringDemo {
    public static void main(String[] args) {


        String str= "Today is a java Class";
        System.out.println(str.startsWith("T"));
        System.out.println(str.startsWith(" Today"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));
        System.out.println(str.contains("java"));
        System.out.println(str.contains("a"));
        System.out.println(str.contains("b"));


    }
}
