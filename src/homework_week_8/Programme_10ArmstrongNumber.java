package homework_week_8;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme_10ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number.");
        }else{
            System.out.println(number + " is not an Armstrong number");
        }
    }
    // Function to check if a number ia an Armstrong number
    public static boolean isArmstrongNumber(int num){
        int originalNum, remainder, result = 0, n= 0;

        originalNum =  num;

        //Calculate the number of digits
        for (;originalNum != 0; originalNum /= 10,++n);

        originalNum = num;
        for(;originalNum != 0; originalNum /= 10){
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }
        // Check if the number is Armstrong
        if(result == num){
            return true;
        }
        return false;
    }
}
