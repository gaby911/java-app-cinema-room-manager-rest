import java.util.Scanner;
/*Write a program that reads four double values a, b, c, d and then evaluates the following expression

a * 10.5 + b * 4.4 + (c + d) / 2.2
The program should output the result.


Sample Input:
1
2.5
0
4.4

Sample Output:
23.5
*/
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