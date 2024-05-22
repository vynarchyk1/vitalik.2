import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввід координат точки
        System.out.print("Введіть координату x: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть координату y: ");
        double y = scanner.nextDouble();

        // Визначення квадранту
        int quadrant;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        } else {
            quadrant = 0; // Якщо точка лежить на одній з координатних осей
        }

        // Вивід результату
        if (quadrant != 0) {
            System.out.println("Точка з координатами (" + x + ", " + y + ") знаходиться у " +
                    "квадранті " + quadrant);
        } else {
            System.out.println("Точка з координатами (" + x + ", " + y + ") лежить на " +
                    "координатних осях.");
        }
    }
}