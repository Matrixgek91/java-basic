package Basic_Exercises;

import java.util.Scanner;

public class Opdracht19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int timesA = 0;

        System.out.println("This program counts the times the letter a is in a word\n");

        System.out.println("Please enter a word:");
        String word = scanner.nextLine();
        word = word.toLowerCase();

        char[] wordCharArray = new char[word.length()];

        for(int i = 0; i < word.length(); i++){
            wordCharArray[i] = word.charAt(i);
        }

        for(char i : wordCharArray){
            if(i == 'a'){
                timesA++;
            }
        }

        System.out.println("This word contains " + timesA + " times the letter a.");





    }
}
