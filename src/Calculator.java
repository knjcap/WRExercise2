import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter your second number: ");
        num2 = sc.nextDouble();
        System.out.println("Enter the operator ( + , - , * or /) ");
        char operator = sc.next().charAt(0);  // chart at = initial string at index 0
        double answers = 0;

        switch (operator) {
            case '+':
                answers = num1 + num2;
                break;
            case '-':
                answers = num1 - num2;
                break;
            case '*':
                answers = num1 * num2;
                break;
            case '/':
                answers = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }
            System.out.println("The final result is: " +num1+ " "+operator+ " " +num2+ " = " +answers );
    }







}
