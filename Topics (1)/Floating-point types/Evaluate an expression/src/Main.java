import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read four double values
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        // Evaluate the expression
        double result = a * 10.5 + b * 4.4 + (c + d) / 2.2;

        // Print the result
        System.out.println(result);

        scanner.close();
    }
}