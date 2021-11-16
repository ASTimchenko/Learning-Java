package lesson3;
//  Вычисление корней квадратного уравнения вида a * x^2 + b * x + c = 0

import java.util.Scanner;

   public class RootsQuadraticEquation {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите значение коффициента a: ");
            double a = scanner.nextDouble();
            System.out.print("Введите значение коффициента b: ");
            double b = scanner.nextDouble();
            System.out.print("Введите значение коффициента c: ");
            double c = scanner.nextDouble();
            if (a==0) {
                System.out.println("Первый коэффициент (a) не может быть 0");
            }
            else {
                double d = Math.pow(b, 2) - (4 * a * c);
                if (d > 0) {
                    double x1 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("Первый корень x1 = " + x1);
                    double x2 = (-b + Math.sqrt(d)) / (2 * a);
                    System.out.println("Второй корень x2 = " + x2);
                } else if (d == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Единственный корень x = " + x);
                } else {
                    System.out.println("Нет действительных решений уравнения");
                }
            }
        }
}
