import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for density (ρ) and height (h)
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Define gravitational acceleration (g)
        double gravity = 9.8;

        // Calculate liquid pressure
        double pressure = density * gravity * height;

        // Print the result without formatting
        System.out.println(pressure);

        scanner.close();
    }
}