package ObjectOriented_Exercises.Vehicles;

public class Car implements Vehicle {
    private String brand;
    private String color;
    protected int speed;

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void drive() {
        speed += 10;
    }
    @Override
    public void brake() {
        speed -= 10;
    }
}
