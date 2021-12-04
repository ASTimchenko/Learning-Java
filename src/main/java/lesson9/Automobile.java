package lesson9;

public abstract class Automobile {

    String name;
    protected final int maxDistance;

    public Automobile(String name, int maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
    }

    public abstract void move(int distance);
}