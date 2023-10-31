package homework_week_8;
/**
 * Even Digit Sum
 *
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class Programme_11EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = getEvenDigitSum(number);
        System.out.println("Sum of even digits: " + result);
        sc.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Negative number, return -1
        }

        int evenDigitSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigitSum += digit;
            }
            number /= 10;
        }

        return evenDigitSum;
    }
}
