package homework_week_8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9FibonacciNumber {
    public static void main(String[] args) {
        int n = 8; //The number of Fibonacci numbers to print
        int[] fibonacci = new int[n];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for(int i = 2; i < n; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Fibonacci Sequence");
        for (int i = 0; i < n; i++){
            System.out.println(fibonacci[i] + " ");
        }
    }
}
