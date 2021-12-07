package lesson10;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Currency currencyAmericanDollar = new StockMarketCurrency("Американский доллар", "American Dollar");
        Currency currencyRussianRuble = new StockMarketCurrency("Российский рубль", "Russian Ruble");
        Currency currencyEuro = new StockMarketCurrency("Евро", "Euro");
        Currency currencySwissFranc = new StockMarketCurrency("Швейцарский франк", "Swiss Franc");

        System.out.println("Добрый день!");
        System.out.println("Представляем вам конвентер следующих валют: Американский доллар, Российский рубль, Евро " +
                "и Швейцарский франк");
        System.out.println("Каждой валюте соответствует свой номер:");
        System.out.println("1 - Американский доллар " + "(" + CurrencyList.as(1) + ")");
        System.out.println("2 - Российский рубль " +  "(" + CurrencyList.as(2) + ")");
        System.out.println("3 - Евро " + "(" + CurrencyList.as(3) + ")");
        System.out.println("4 - Швейцарский франк " + "(" + CurrencyList.as(4) + ")");


        int currencyIsChanged = getNumberIsChanged();
        int currencyForChanged = NumberForChanged(currencyIsChanged);
        double currencyValue = getValue();

        if (currencyIsChanged == 1) {
            currencyAmericanDollar.resultValue(currencyIsChanged, currencyForChanged, currencyValue);
        }
        if (currencyIsChanged == 2) {
            currencyRussianRuble.resultValue(currencyIsChanged, currencyForChanged, currencyValue);
        }
        if (currencyIsChanged == 3) {
            currencyEuro.resultValue(currencyIsChanged, currencyForChanged, currencyValue);
        }
        if (currencyIsChanged == 4) {
            currencySwissFranc.resultValue(currencyIsChanged, currencyForChanged, currencyValue);
        }
    }

    private static int getNumberIsChanged() {
        System.out.print("Введите номер валюты, которую будем конвентировать: 1, 2, 3 или 4: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Простите, но ввод подразумевает целое число");
            System.out.print("Введите номер валюты, которую будем конвентировать: 1, 2, 3 или 4: ");
            scanner.next();
        }
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.printf("Вы указали значение %d, которое недопустимо в программе\n", number);
            return getNumberIsChanged();
        }
        if (number > 4) {
            System.out.printf("Вы указали значение %d, которое недопустимо в программе\n", number);
            return getNumberIsChanged();
        }
        return number;
    }

    private static int NumberForChanged(int currencyIsChanged) {
        System.out.print("Введите номер валюты, в которую будем конвентировать: 1, 2, 3 или 4: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Простите, но ввод подразумевает число");
            System.out.println("Введите номер валюты, в которую будем конвентировать: 1, 2, 3 или 4: ");
            scanner.next();
        }
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.printf("Вы указали значение %d, которое недопустимо в программе\n", number);
            return NumberForChanged(currencyIsChanged);
        }
        if (number > 4) {
            System.out.printf("Вы указали значение %d, которое недопустимо в программе\n", number);
            return NumberForChanged(currencyIsChanged);
        }

        if (number == currencyIsChanged) {
            System.out.println("Вы указали одну и ту же валюту");
            return NumberForChanged(currencyIsChanged);
        }
        return number;
    }

    private static double getValue() {
        System.out.print("Введите сумму, которую будем конвентировать: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Простите, но ввод подразумевает число");
            scanner.next();
        }
        double number = scanner.nextDouble();
        if (number <= 0) {
            System.out.printf("Вы указали значение %d, которое недопустимо в программе\n", number);
            System.out.print("веедите сумму: ");
            return getNumberIsChanged();
        }
        return number;
    }
}
