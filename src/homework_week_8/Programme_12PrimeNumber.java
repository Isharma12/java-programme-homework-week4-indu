package homework_week_8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words, prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

public class Programme_12PrimeNumber { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    // Check if the number is less than or equal to 1.
    if (number <= 1) {
        System.out.println(number + " is not a prime number.");
    } else {
        // Check if the number is divisible by any number from 2 to its square root.
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // If the number is not divisible by any number from 2 to its square root, it is a prime number.
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
}

