package lesson9;

public class Car extends Automobile{
    public Car(String name, int maxDistance) {
        super(name, maxDistance);
    }


    public void move(int distance) {
        if (distance <= this.maxDistance) {
            System.out.println("Легковая машина " + this.name + " проедит расстояние "  + distance);
        }else {
            System.out.println("Легковая машина " + this.name + " не проедит расстояние "  + distance
                    + ", так как её запас хода равен " + this.maxDistance);
            }
    }
}