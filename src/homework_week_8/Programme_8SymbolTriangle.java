package homework_week_8;

/**
 *  Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */


public class Programme_8SymbolTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            //Inner loop for printing "@" in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}