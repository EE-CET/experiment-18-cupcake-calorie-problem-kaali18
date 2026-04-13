import java.util.Scanner;
import java.util.Arrays;

public class Cupcake {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            long[] calories = new long[n];
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextLong()) {
                    calories[i] = scanner.nextLong();
                }
            }

            Arrays.sort(calories);

            long totalMiles = 0;
            for (int i = 0; i < n; i++) {
                // Calories are sorted in ascending order.
                // To minimize the sum, we use the largest calories with the smallest powers of 2.
                // So we iterate backwards from the end of the array.
                totalMiles += calories[n - 1 - i] * Math.pow(2, i);
            }

            System.out.println(totalMiles);
        }
    }
}
