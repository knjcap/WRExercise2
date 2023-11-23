import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String strToReverse = scanner.nextLine();
        if (strToReverse.equalsIgnoreCase(new StringBuilder(strToReverse).reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }

    }
}
// using scanner, string equals, stringbuilder reverse