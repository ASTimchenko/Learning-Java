package lesson10;

public enum CurrencyList {

    USD(1), RUB(2), EUR(3), CHF(4);

    public int number;

    CurrencyList(int number) {
        this.number = number;
    }

    public static CurrencyList as(int number) {

        for (CurrencyList currencyList : values()) {
            if (currencyList.number == number) {
                return currencyList;
            }
        }
        return CurrencyList.RUB;
    }
}

