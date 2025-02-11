import java.util.Scanner;
/*Write a program that reads the distance between two cities in miles and the travel time by bus in hours and outputs the average speed of the bus.

Note: there is NO need to give any explanations during input and output.


Sample Input:
100
2

Sample Output:
50.0*/
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cityDistance = scanner.nextInt();
        int busTime = scanner.nextInt();

        int averageSpeedOfTheBus = cityDistance / busTime;
        System.out.println(averageSpeedOfTheBus);
    }
}