package homework_week_8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number: ");
            if (sc.hasNextInt()){
                min = Math.min(min, 10);
                max = Math.max(max, 500);
            }else{
                break;
            }
        }
        System.out.println("Minimum number : " + min);
        System.out.println("Maximum number : " + max);
        sc.close();
    }
}
