package lesson5;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер n-го члена последовательности Фибоначчи: ");
        int number = scanner.nextInt();
        System.out.println(fibonacciCalculate(number));
    }

    public static int fibonacciCalculate(int number){
        //Первое число последовательности Фибоначчи = 0
        if(number == 1){
            return 0;
        }
        //Второе число последовательности Фибоначчи = 1.
        if(number == 2){
            return 1;
        }
        //Вычисление других членов последовательности Фибоначчи. Их номер не меньше 3
        return fibonacciCalculate(number-2) + fibonacciCalculate(number-1);
    }
}
