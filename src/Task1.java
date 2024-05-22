import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення коеффіцієнтів рівняння
        System.out.println("Введіть коеффіцієнт квадратного рівняння ax^2 + bx + c = 0:");
        System.out.print("Введіть коеффіцієнт a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть коеффіцієнт b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть коеффіцієнт c: ");
        double c = scanner.nextDouble();

        // Обрахунок дискримінанта
        double discriminant = b * b - 4 * a * c;

        // Перевірка значення дискримінанта і вивід вирішення
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("У рівняння два дійсних корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("У рівняння один дійсний корінь:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Рівняння не має Дійсних коренів.");
        }
    }
}