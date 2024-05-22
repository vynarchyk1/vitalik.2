import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення числа
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        // Перевірка на двузначність і парність
        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Введене число " + number + " є двузначним і парним.");
            } else {
                System.out.println("Введене число " + number + " є двузначним, але непарним.");
            }
        } else {
            System.out.println("Введене число не є двузначним.");
        }
    }
}
