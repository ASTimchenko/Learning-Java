package lesson3;

import java.util.Scanner;

public class Factorial {

    // Факториал числа n! — произведение всех натуральных чисел до n включительно:
    // По определению полагают 0! = 1. Факториал определён только для целых неотрицательных чисел

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        double n = scanner.nextDouble();

             if (n < 0) {
                 System.out.println("Число " + n + " не является натуральным!");
              }

             if (n == 0) {
                System.out.println("По определению полагают 0! = 1");
             }

             if (n >= 1) {
             int resultFactorial = 1;
                for (int i = 1; i <= n; i++) {
                  resultFactorial = resultFactorial * i;
                  }
             System.out.println("Факториал числа " + (int) n + " = "+ resultFactorial);
        }
    }
}