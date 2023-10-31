package homework_week_8;

import java.util.Scanner;

public class Programme_5PalindromeNumber { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    boolean isPalin = isPalindrome(number);
    if (isPalin) {
        System.out.println(number + " is a palindrome.");
    } else {
        System.out.println(number + " is not a palindrome.");
    }
}

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            // Negative numbers can also be palindromes
            number = Math.abs(number);
        }

        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}

