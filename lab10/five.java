import java.util.Scanner;

public class DynamicDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the diamond (odd number recommended): ");
        int size = scanner.nextInt();

        printDiamondPattern(size);
    }

    public static void printDiamondPattern(int size) {
        int mid = size / 2;

        // Upper half including the middle line
        for (int i = 0; i <= mid; i++) {
            // Left stars
            for (int j = 0; j < mid - i + 1; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < mid - i + 1; j++) {
                if (i == 0 && j == 0) continue; // Skip one star for first line
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = mid - 1; i >= 0; i--) {
            // Left stars
            for (int j = 0; j < mid - i + 1; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < mid - i + 1; j++) {
                if (i == 0 && j == 0) continue; // Skip one star for last line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
