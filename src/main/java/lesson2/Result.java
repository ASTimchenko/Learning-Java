package lesson2;

public class Result {

    public static void main(String[] args) {

        long Summa = sum(16,8);
        System.out.println(Summa);

        long Raznost = difference(16,8);
        System.out.println(Raznost);

        long Proizvedenie = multiplication(16,8);
        System.out.println(Proizvedenie);

        long Delenie = division(16,8);
        System.out.println(Delenie);
    }

    /**
     * Арифметические действия над двумя целыми числами
     * @arg1      первое число
     * @arg2      второе число
     * @sum      результат сложения двух чисел
     * @difference    результат разности двух чисел
     * @multiplication    результат умножения двух чисел
     * @division   результат деления двух чисел
     */

    public static long sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static long difference(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static long division (int arg1, int arg2) {
        return arg1 / arg2;
    }
}
