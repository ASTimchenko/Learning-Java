package lesson4;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите введите целое и неотрицательное число, квадратый корень которого будем вычислять: ");
        while (!scanner.hasNextInt()){
        String text = scanner.next();
        System.out.print( text + " не является целым числом. Введите введите целое и неотрицательное число, квадратый корень которого будем вычислять: ");
        }
        int quadratic = scanner.nextInt();
        int firstNumber = 1;
        scanner.close();

        if (quadratic == 0) {
            System.out.println("Корень числа 0 = 0");
        } else if (quadratic == 1){
            System.out.println("Корень числа 1 = 1");
        } else if (quadratic < 0){
            System.out.println("Квадрат числа не может быть меньше 0!");
        } else if (quadratic > 0){
            while (firstNumber * firstNumber < quadratic) {
                  firstNumber++;
            }
            System.out.println("Корень числа " + (int) quadratic + " равен " + firstNumber);
        }
    }
}
