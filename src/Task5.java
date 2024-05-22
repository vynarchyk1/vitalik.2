import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Виводимо текстове меню
        System.out.println("Меню:");
        System.out.println("1. Привітання");
        System.out.println("2. Запрошення до роботи на комп'ютері");
        System.out.println("3. Завершити роботу");

        // Зчитуємо вибір користувача
        System.out.print("Виберіть пункт меню: ");
        int choice = scanner.nextInt();

        // Обробляємо вибір користувача
        switch (choice) {
            case 1:
                System.out.println("Привіт!");
                break;
            case 2:
                System.out.println("Запрошую до роботи на комп'ютері.");
                break;
            case 3:
                System.out.println("До побачення!");
                break;
            default:
                System.out.println("Невірний вибір!");
        }

        // Закриваємо Scanner
        scanner.close();
    }
}
