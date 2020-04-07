package ObjectOriented_Excercises.Cars;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla","Red");
        Car car2 = new Car("Suzuki","Grey");
        Truck truck1 = new Truck("Volvo", "Blue");
        RaceCar mySecondCar = new RaceCar("Ferrari", "Red");
        Bike myBike = new Bike("VanMoof", "Grey");

        car.drive();
        car.brake();

        car2.drive();
        car2.drive();
        car2.drive();

        truck1.setLoadability(1000);

        System.out.println(car.toString());
        System.out.println(car2.toString());
    }
}
