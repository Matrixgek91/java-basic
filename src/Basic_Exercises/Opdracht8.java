package Basic_Exercises;

import java.util.Scanner;

public class Opdracht8 {
    public static void main(String[] args) {

        int[] myNum = new int[3];
        int largestNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers.\n");

        System.out.print("Number one: ");
        myNum[0] = scanner.nextInt();
        System.out.print("Number two: ");
        myNum[1] = scanner.nextInt();
        System.out.print("Number three: ");
        myNum[2] = scanner.nextInt();

        for(int i : myNum){
            if(i > largestNumber){
                largestNumber = i;
            }
        }

        System.out.println("\nThe largest of these numbers is: " + largestNumber);


    }
}
