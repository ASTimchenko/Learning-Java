package lesson7;

import java.util.Scanner;

public class DogRunner {

    public static void main(String[] args) {
        //Запрос на ввод дистанции для бега
        System.out.print("Приветствуем, введите длину дистанции для бега: ");
        double intervalRun = getLength();

        //Запрос на ввод дистанции для плавания
        System.out.print("Приветствуем, введите длину дистанции для плавания: ");
        double intervalSwimming = getLength();

        //Данные по первой собаке
        Dog DogRex = new Dog();
        DogRex.nickname = "Рекс";
        DogRex.gender = "кобель";
        DogRex.breet = "Спаниэль";
        DogRex.color = "чёрный";
        DogRex.age = 5;
        DogRex.weight = 30;
        DogRex.maxDistance = 500;
        DogRex.maxSwimming = 35;

        //Данные по второй собаке
        Dog DogManja;
        DogManja = new Dog();
        DogManja.nickname = "Маня";
        DogManja.gender = "сука";
        DogManja.breet = "Французкий пудель";
        DogManja.color = "белый";
        DogManja.age = 3;
        DogManja.weight = 25;
        DogManja.maxDistance = 400;
        DogManja.maxSwimming = 15;

        //Данные по третьей собаке
        Dog DogBaron = new Dog("Барон", "кобель", "Немецкая овчарка", "серый", 6,
                50, 600, 45);

        //Объединение данных по собакам в массив
        Dog[] hunds= new Dog [] {DogRex, DogManja, DogBaron};

        System.out.println("-----------------------------------");
        //Результаты по бегу
        System.out.println("Результаты по бегу:");
        for (Dog Dog: hunds) {
                System.out.println(Dog.getRun(intervalRun));
        }
        System.out.println("-----------------------------------");
        //Результаты по плаванию
        System.out.println("Результаты по плаванию:");
        for (Dog Dog: hunds) {
            System.out.println(Dog.getSwimming(intervalSwimming));
        }
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
