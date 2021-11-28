package lesson7;

import java.util.Scanner;

public class TigerRun {
    public static void main(String[] args) {
        //Запрос на ввод дистанции для бега
        System.out.print("Приветствуем, введите длину дистанции для бега: ");
        double intervalRun = getLength();

        //Данные по первому тигру
        Tiger TigerAmur = new Tiger("Амур", "мужской", "Дальний Восток", 10, 250,
                1000, 45);
        //Данные по второму тигру
        Tiger TigerRamses = new Tiger("Рамзес", "мужской", "Центральная Африка", 8, 300,
                1200, 48);
        //Данные по второму тигру
        Tiger TigerSima = new Tiger("Сима", "женский", "Индия", 5, 200,
                900, 50);



        Tiger[] Tigers = new Tiger [] {TigerAmur, TigerRamses, TigerSima};

        System.out.println("-----------------------------------");
        //Результаты по бегу
        System.out.println("Результаты по бегу:");
        for (Tiger Tiger: Tigers) {
            System.out.println(Tiger.getTigerRun(intervalRun));
        }
        System.out.println("-----------------------------------");

    }

    private static double getLength() {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextDouble()) {
            System.out.println("Простите, но ввод подразумевает число");
            scanner.next();
        }
        double length = scanner.nextDouble();

        if (length < 0) {
            System.out.println("Вы указали отрицательное значение, " + length + " ,что недопустимо в программе");
            System.out.print("Укажите длину как положительной число: ");
            return getLength();
        }
        else if (length > 0) {
            return length;
        }
        else if (length == 0) {
            System.out.println("Вы указали число равное 0, что недопустимо в программе");
            System.out.print("Укажите длину как положительной число: ");
            return getLength();
        }
        return -1;
    }
}

