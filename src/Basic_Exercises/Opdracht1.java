package Basic_Exercises;

import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the following to construct a sentence");

        System.out.print("article: ");
                String article = scanner.nextLine();
        System.out.print("noun: ");
                String noun = scanner.nextLine();
        System.out.print("verb: ");
            String verb = scanner.nextLine();

        System.out.println("Your sentence is: " + article + " " +  noun + " " + verb);
    }
}
