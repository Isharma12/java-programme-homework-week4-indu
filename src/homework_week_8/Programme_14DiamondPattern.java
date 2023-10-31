package homework_week_8;
/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

import java.util.Scanner;

public class Programme_14DiamondPattern {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Print the upper half of the diamond

        int i = 1;
        while (i <= n) {
            // Print spaces

            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        // Print the lower half of the diamond
        i = n - 1;
        while (i >= 1) {
            // Print spaces


            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
