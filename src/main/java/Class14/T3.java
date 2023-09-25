package Class14;

public class T3 {
    public static void main(String[] args) {
        System.out.println(T3.reverseStr("Hello"));
    }

      static String reverseStr(String inputStr){

          String reversed="";
          for (int i = inputStr.length()-1; i >=0 ; i--) {
              reversed=reversed+inputStr.charAt(i);

          }
          return reversed;
    }

}
