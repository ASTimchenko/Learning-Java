package lesson10;

public abstract class Currency {
    protected final String nameRussian;
    protected final String nameEnglish;

    public Currency(String nameRussian, String nameEnglish) {
        this.nameRussian = nameRussian;
        this.nameEnglish = nameEnglish;
    }

   public abstract double resultValue(int currencyIsChanged, int currencyForChanged, double currencyValue);
}
