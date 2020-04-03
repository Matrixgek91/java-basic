package Basic_Exercises;

import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {

        int[] testScores = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter five test scores between 1 and 10.\n");

        System.out.print("Test score one: ");
        testScores[0] = scanner.nextInt();
        System.out.print("Test score two: ");
        testScores[1] = scanner.nextInt();
        System.out.print("Test score three: ");
        testScores[2] = scanner.nextInt();
        System.out.print("Test score four: ");
        testScores[3] = scanner.nextInt();
        System.out.print("Test score five: ");
        testScores[4] = scanner.nextInt();

        int sevenPlus = 0;

        for(int i : testScores){
            if(i > 7){
                sevenPlus++;
            }
        }

        System.out.println("\nThe number of test scores that is higher than 7 is: " + sevenPlus);


    }
}
