package Project0;

public class T3 {
    public static void main(String[] args) {

        String word = "Rotator";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);

        }
        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");

        }
    }
}
