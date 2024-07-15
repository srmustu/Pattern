import java.util.Scanner;

public class Pattern {

    // Recursive method to follow the described pattern
    static void printPattern(int n, int original, boolean isDecreasing) {
        // Print the current value of n
        System.out.print(n + " ");

        // Base case: if n is back to the original value and increasing, stop recursion
        if (n == original && !isDecreasing) {
            return;
        }

        // Recursive case: decrease or increase n
        if (isDecreasing) {
            if (n > 0) {
                printPattern(n - 5, original, true);
            } else {
                printPattern(n + 5, original, false);
            }
        } else {
            printPattern(n + 5, original, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = input.nextInt();

        // Start the pattern with the initial value of n
        printPattern(n, n, true);
    }
}
