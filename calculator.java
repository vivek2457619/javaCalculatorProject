import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator program!");

        System.out.print("Please enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("What operation would you like to perform? (+, -, *, /)");
        String operator = scanner.next();

        double result = 0;

        // Perform the selected operation
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: division by zero!");
                    System.exit(0);
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: invalid operator!");
                System.exit(0);
        }

        System.out.println("The result is: " + result);
    }
}
