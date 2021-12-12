package lesson10;

public final class StockMarketCurrency extends Currency {
    public StockMarketCurrency(String nameRussian, String nameEnglish) {
        super(nameRussian, nameEnglish);
    }

    public double resultValue(int currencyIsChanged, int currencyForChanged, double currencyValue) {

        double result;
         if (currencyIsChanged == 1) {
             switch (currencyForChanged) {
                 case 2 :
                     result = currencyValue  * 74.5;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(1) + " конвентируется в " +
                             result + " " + CurrencyList.as(2));
                     break;
                 case 3 :
                     result = currencyValue  * 0.88511;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(1) + " конвентируется в " +
                             result + " " + CurrencyList.as(3));
                     break;
                 case 4 :
                     result = currencyValue  * 0.9223;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(1) + " конвентируется в " +
                             result + " " + CurrencyList.as(4));
                     break;
             }
         }
         if (currencyIsChanged == 2) {
             switch (currencyForChanged) {
                 case 1 :
                     result = currencyValue  / 74.5;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(2) + " конвентируется в " +
                             result + " " + CurrencyList.as(1));
                     break;
                 case 3 :
                     result = currencyValue  / 83.24;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(2) + " конвентируется в " +
                             result + " " + CurrencyList.as(3));
                     break;
                 case 4 :
                     result = currencyValue  / 80.08;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(2) + " конвентируется в " +
                             result + " " + CurrencyList.as(4));
                     break;
             }
         }
         if (currencyIsChanged == 3) {
             switch (currencyForChanged) {
                 case 1 :
                 result = currencyValue  * 1.13;
                 System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(3) + " конвентируется в " +
                         result + " " + CurrencyList.as(1));
                 break;
                 case 2 :
                     result = currencyValue  * 1.05;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(3) + " конвентируется в " +
                             result + " " + CurrencyList.as(2));
                     break;
                 case 4 :
                     result = currencyValue  / 80.08;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(3) + " конвентируется в " +
                             result + " " + CurrencyList.as(4));
                     break;
             }
         }
         if (currencyIsChanged == 4) {
             switch (currencyForChanged) {
                 case 1 :
                     result = currencyValue  * 1.08;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(4) + " конвентируется в " +
                             result + " " + CurrencyList.as(1));
                     break;
                 case 2 :
                     result = currencyValue  * 80.08;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(4) + " конвентируется в " +
                             result + " " + CurrencyList.as(2));
                     break;
                 case 3 :
                     result = currencyValue  * 0.95592;
                     System.out.println("Сумма в " + currencyValue + " " + CurrencyList.as(4) + " конвентируется в " +
                             result + " " + CurrencyList.as(4));
                     break;

             }
         }
        return currencyIsChanged;
    }


}

