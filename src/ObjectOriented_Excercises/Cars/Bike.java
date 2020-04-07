package ObjectOriented_Excercises.Cars;

public class Bike implements Vehicle {
    private String brand;
    private String color;

    public Bike(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void drive() {

    }

    @Override
    public void brake() {

    }
}
