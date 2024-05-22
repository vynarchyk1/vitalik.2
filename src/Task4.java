import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для отримання введення користувача
        Scanner scanner = new Scanner(System.in);

        // Отримуємо значення x від користувача
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        // Обчислюємо значення функції f(x) в залежності від значення x
        double result;
        if (x < 0) {
            result = Math.pow(x, 2) + 3;
        } else if (x >= 0 && x <= 5) {
            result = Math.pow(x, 0.2) + 5;
        } else {
            result = -x + Math.exp(x);
        }

        // Виводимо результат
        System.out.println("Значення функції f(x) для x = " + x + " дорівнює " + result);

        // Закриваємо Scanner
        scanner.close();
    }
}
