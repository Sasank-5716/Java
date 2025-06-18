import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input: operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        scanner.close();
    }
}

