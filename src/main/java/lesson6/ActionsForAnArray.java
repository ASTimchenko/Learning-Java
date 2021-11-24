package lesson6;

import java.util.Scanner;

public class ActionsForAnArray {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите длину массива (целое и неотрицательное число, которое больше 0): ");
        while (!scanner.hasNextInt()){
            String text = scanner.next();
            System.out.print( text + " не является целым числом. Введите введите целое и неотрицательное число: ");
        }
        int number = scanner.nextInt();
        scanner.close();
        //Проверка введённого числа на то, что оно больше 0.
        //То, что число является целым проверили на вводе.
        //Вввод элементов массива.
        //Поиск минимального и максимального элемента массива, вычисление среднего значения.

        if (number > 0) {
            double summa = 0; //Сумма для поиска среднего.
            double[] array = new double[number];
            double biggestValue = 0; //Присваиваем максимальное значение, изначально не меньше, чем выдаёт random.
            int maxNumber = -1; //Присваиваем номер элемента с максимальным значением, изначально неверным.
            double smallestValue = 1; //Присваиваем минимальное значение, изначально больше, чем выдаёт random.
            int minNumber = -1; //Присваиваем номер элемента с максимальным значением, изначально неверным.

            System.out.println("");
            System.out.println("Элементы массива:");

                     for (int i = 0; i < array.length; i++) {
                      array[i] = Math.random();

                          //Поиск максимального элемента и его значения
                          if (biggestValue < array[i]) {
                              biggestValue = array[i];
                              maxNumber = i;
                          }

                              //Поиск минимального элемента и его значения
                                if (smallestValue > array[i]) {
                                    smallestValue = array[i];
                                    minNumber = i;
                                }
                System.out.println(i + " = " + array[i]);
                summa = summa + array[i];
             }
            summa = summa / number;
              System.out.println ("------------------------------------------------");
              System.out.println ("Минимальный элемент массива " + minNumber + " = " + smallestValue);
              System.out.println ("Максимальный элемент массива " + maxNumber + " = " + biggestValue);
              System.out.println ("Среднее значение элементов массива " + " = " + summa);

        }

        //Проверка данных, введённых пользователем.
        //Число должно быть большим 0.
        //То, что число является целым проверили на вводе.
              else if (number == 0 ){
               System.out.println("Длина массива не может быть равной 0.");
               System.out.println("Пожалуйста перезапустите программу.");
              }
              else if (number < 0 ){
               System.out.println("Длина массива не может быть отрицательной.");
               System.out.println("Пожалуйста перезапустите программу.");
        }

    }
}

