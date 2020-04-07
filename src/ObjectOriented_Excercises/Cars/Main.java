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
        System.out.println(car.toString());

        car2.drive();
        car2.drive();
        car2.drive();
        System.out.println(car2.toString());

        truck1.setLoadability(1000);
        truck1.drive();
        truck1.drive();
        truck1.brake();
        System.out.println(truck1.speed);

        mySecondCar.setTopSpeed(330);
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        mySecondCar.drive();
        System.out.println(mySecondCar.speed);

        myBike.drive();
        System.out.println(myBike.speed);




    }
}
