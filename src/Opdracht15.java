import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht15 {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<Integer>();

        int myNum;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter odd numbers between 1 and 20. When done, type exit. \nPlease enter numbers:");
        while(scanner.hasNextInt()){
            myNum = scanner.nextInt();
            if(myNum > 0 && myNum < 21 && (myNum % 2) == 1){
                numList.add(myNum);
            }else{
                System.out.println("Invalid number, please try again.");
            }
        }

        for (int i : numList){
            sum = sum + i;
        }

        System.out.println("The sum of these numbers is: " + sum);

    }
}
