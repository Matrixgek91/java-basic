package ObjectOriented_Excercises.Cars;

public class Truck extends Car {
    private int loadability;

    public Truck(String brand, String color) {
        super(brand, color);
    }

    public int getLoadability() {
        return loadability;
    }

    public void setLoadability(int loadability) {
        this.loadability = loadability;
    }

    @Override
    public void drive() {
        speed += 5;
    }

    @Override
    public void brake() {
        speed -= 5;
    }
}
