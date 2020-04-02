import java.util.Scanner;

public class Opdracht21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("This program adds the numbers of a positive integer\n");

        System.out.println("Please enter the number:");
        String[] numArray = scanner.nextLine().split("");


        for (String myNum : numArray){
            sum = sum + Integer.parseInt(myNum);
        }

        System.out.println("The sum of these numbers is: " + sum);



    }
}
