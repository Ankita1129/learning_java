import java.util.Arrays;
import java.util.Scanner;

/*Given an array of distinct elements. Find the third largest element in it.
Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.*/

public class third_largest_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array); // Sorting array
        if (n >= 3) {
            System.out.println(array[n - 3]);
        } else {
            System.out.println("-1");
        }
        scanner.close();
    }
}
