package lesson10;

public final class StockMarketCurrency extends Currency {
    public StockMarketCurrency(String nameRussian, String nameEnglish) {
        super(nameRussian, nameEnglish);
    }

    public double resultValue(int currencyIsChanged, int currencyForChanged, double currencyValue) {
         if (currencyIsChanged == 1) {
             switch (currencyForChanged) {
                 case 2 -> System.out.println(currencyValue * 74.5);
                 case 3 -> System.out.println(currencyValue * 0.88511);
                 case 4 -> System.out.println(currencyValue * 0.9223);
             }
         }
         if (currencyIsChanged == 2) {
             switch (currencyForChanged) {
                 case 1 -> System.out.println(currencyValue / 74.5);
                 case 3 -> System.out.println(currencyValue / 83.24);
                 case 4 -> System.out.println(currencyValue / 80.08);
             }
         }
         if (currencyIsChanged == 3) {
             switch (currencyForChanged) {
                 case 1 -> System.out.println(currencyValue * 1.13);
                 case 2 -> System.out.println(currencyValue * 83.24);
                 case 4 -> System.out.println(currencyValue * 1.05);
             }
         }
         if (currencyIsChanged == 4) {
             switch (currencyForChanged) {
                 case 1 -> System.out.println(currencyValue * 1.08);
                 case 2 -> System.out.println(currencyValue * 80.08);
                 case 3 -> System.out.println(currencyValue * 0.95592);
             }
         }
        return currencyIsChanged;
    }


}

