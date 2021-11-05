package lesson2;

public class Peremeshcheniye {
        public static void main(String[] args) {

        int Answer = movement(30,50,2);
        System.out.println(Answer);
}

    /**
     * Вычисление перемещения
     * @put     перемещение
     * @sp1      начальная скорость
     * @sp2      конечная скрость
     * @ac     ускорение
     */

    public static int movement(int sp1, int sp2, int ac) {
        return  (sp2*sp2 - sp1*sp1) / (2 * ac);
    }
}
