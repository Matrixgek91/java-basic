package Basic_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opdracht11 {
    public static void main(String[] args) {

        int[] productPrice = new int[]{295, 499, 549, 780, 885};
        double totalPrice;
        int productNumber;
        int unitsSold;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the product number and how many units have been sold.\n");

        System.out.print("Please enter the product number: ");
        productNumber = scanner.nextInt();
        System.out.print("Please enter the number of units sold: ");
        unitsSold = scanner.nextInt();

        totalPrice = (productPrice[(productNumber - 1)] * unitsSold);

        System.out.println("The total retail value is: " +(totalPrice / 100));




    }
}
