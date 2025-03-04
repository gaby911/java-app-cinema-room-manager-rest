import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cityDistance = scanner.nextInt();
        int busTime = scanner.nextInt();

        int i = cityDistance / busTime;
        System.out.println(i);
    }
}