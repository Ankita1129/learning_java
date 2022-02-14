import java.util.Arrays;
import java.util.Scanner;

public class max_trio {
    public static long solve(long[] arr, int n) {
        if (n < 3) {
            return 0;
        }
        Arrays.sort(arr);
        long max = (arr[n - 1] - arr[0]) * arr[n - 2];
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
            long max = solve(arr, n);
            System.out.println(max);
        }
        scanner.close();
    }
}
