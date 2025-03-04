import java.util.Scanner;
/*
* Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit (°F).

Use the following formula:

F = C * 1.8 + 32
where C is a temperature in Celsius and F is the corresponding temperature in Fahrenheit.


Sample Input:
32.9

Sample Output:
91.22
*/
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        System.out.println(celsius * 1.8 + 32);

    }
}