import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the opposite and adjacent side of a right triangle to calculate the length of the hypotenuse.\n");

        System.out.print("Length opposite side: ");
        double opposite = scanner.nextDouble();
        System.out.print("Length adjacent side: ");
        double adjacent = scanner.nextDouble();

        double hypotenuse;
        double hypotenuse_squared;

        hypotenuse_squared = (opposite * opposite) + (adjacent * adjacent);
        hypotenuse = sqrt(hypotenuse_squared);

        System.out.println("\nThe length of the hypotenuse is: " + hypotenuse);
    }
}
