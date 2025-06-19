import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the amount to convert
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Input the source currency
        System.out.print("Enter the currency to convert from (USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        // Input the target currency
        System.out.print("Enter the currency to convert to (USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        double conversionRate = 0;
    }
}

