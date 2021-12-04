package lesson9;

public class Truck extends Automobile {
    public Truck(String name, int maxDistance) {
        super(name, maxDistance);
    }


    public void move(int distance) {
        if (distance <= this.maxDistance) {
            System.out.println("Грузовик " + this.name + " проедит расстояние "  + distance);
        }else {
            System.out.println("Грузовик " + this.name + " не проедит расстояние "  + distance
                    + ", так как его запас хода равен " + this.maxDistance);
        }
    }
}
