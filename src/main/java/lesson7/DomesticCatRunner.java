package lesson7;

import java.util.Scanner;

public class DomesticCatRunner {

    public static void main(String[] args) {
        //Запрос на ввод дистанции для бега
        System.out.print("Приветствуем, введите длину дистанции для бега: ");
        double intervalRun = getLength();

        //Запрос на ввод дистанции для плавания
        System.out.print("Приветствуем, введите длину дистанции для плавания: ");
        double intervalSwimming = getLength();

        //Данные по первой кошке
         DomesticCat CatPersik = new DomesticCat("Персик", "кот", "вислоухий", "пёстрый", 5,
            10, 200, 0);
        //Данные по второй кошке
        DomesticCat CatBarsik = new DomesticCat("Барсик", "кот", "сибиркий", "черный", 8,
            12, 210, 0);
        //Данные по третьей кошке
         DomesticCat CatMusya = new DomesticCat("Муся", "кошка", "британка", "сизый", 6,
            8, 180, 0);

        DomesticCat[] cats = new DomesticCat [] {CatPersik, CatBarsik, CatMusya};

        System.out.println("-----------------------------------");
        //Результаты по бегу
        System.out.println("Результаты по бегу:");
        for (DomesticCat DomesticCat: cats) {
            System.out.println(DomesticCat.getCatsRun(intervalRun));
        }
        System.out.println("-----------------------------------");
        //Результаты по плаванию
        System.out.println("Результаты по плаванию:");
        if (intervalSwimming != 0) {
            System.out.println("Кошки не плавают!");
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
