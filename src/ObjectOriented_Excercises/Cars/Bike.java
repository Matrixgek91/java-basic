package ObjectOriented_Excercises.Cars;

public class Bike implements Vehicle {

    protected int speed;
    public Bike(String brand, String color) {
    }

    @Override
    public void drive() {
        speed += 1;
    }

    @Override
    public void brake() {
        speed -= 1;
    }
}
