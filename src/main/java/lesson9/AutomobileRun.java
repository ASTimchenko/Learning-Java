package lesson9;

public class AutomobileRun {
    public static void main(String[] args) {
        Automobile carVaz = new Car("ВАЗ",500);
        Automobile carVolvo = new Car("VOLVO",450);
        Automobile carBmv = new Car("BMV", 400);
        Automobile carScoda = new Car("SCODA",350);
        Automobile carSaab = new Car("SAAB",300);
        Automobile truckScania = new Truck("SCANIA",1200);
        Automobile truckReno = new Truck("RENO", 1150);
        Automobile truckMaz = new Truck("MAZ",1100);
        Automobile truckHino = new Truck("HINO",1050);
        Automobile truckKamaz = new Truck("KAMAZ",1000);

        Automobile [] newAutomobile = new Automobile[] {carVaz, carVolvo, carBmv, carScoda, carSaab,
                truckScania, truckReno, truckMaz, truckHino, truckKamaz};

        int distance = Math.round((float) Math.random() * 1300);
        System.out.println("---------------------------------------------");
        System.out.println("Расстояние (сгенирировано программой): " + distance);
        System.out.println("---------------------------------------------");

        for (Automobile newAutomobile1 : newAutomobile) {
            newAutomobile1.move(distance);
        }
    }
}
