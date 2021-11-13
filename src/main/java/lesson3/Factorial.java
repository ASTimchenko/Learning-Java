package lesson3;

public class Factorial {

    // Факториал числа n! — произведение всех натуральных чисел до n включительно:
    // По определению полагают 0! = 1. Факториал определён только для целых неотрицательных чисел.

    public static void main(String[] args) {
        int n = 5;

        if (n < 0) {
            System.out.println("Число n должно быть натуральным!");
        }

        if (n == 0) {
            System.out.println("По определению полагают 0! = 1");
        }

        if (n >= 1) {
            int resultFactorial = 1;
            for (int i = 1; i <= n; i++) {
                resultFactorial = resultFactorial * i;
            }
            System.out.println("Факториал числа " + n + " = "+ resultFactorial);
        }
    }
}