package homework_week_8;
/**
 * Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_3FindVowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        char ch = sc.next().charAt(0);

        //check if the input is a valid alphabet
        if (!Character.isLetter(ch)){
            System.out.println("Invalid Input. Please enter a single alphabet.");
            System.exit(1);
        }
        //Check if the input is a vowel a consonant
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U'){
            System.out.println("Input letter is vowel");
        }else{
            System.out.println("Input letter is consonant");
        }
    }


    }

