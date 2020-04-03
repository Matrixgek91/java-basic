package Basic_Exercises;

import java.util.Scanner;

public class Opdracht9 {
    public static void main(String[] args) {

        int myNum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will verify whether the number you input is in the range of 1 through 10.\n");

        System.out.print("Please enter the number: ");
        myNum = scanner.nextInt();

        if(myNum > 0 && myNum < 11){
            System.out.println("\nThe number " + myNum + " is valid.");
        }else{
            System.out.println("\nThe number " + myNum + " is invalid.");
        }



    }
}
