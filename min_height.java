import java.util.Arrays;
import java.util.Scanner;

public class min_height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k); // Maximum possible height difference

        int tempmax = arr[n - 1] - k; // Max element when we subtract k from whole array
        int tempmin = arr[0] + k; // Min element when we add k to whole array
        int max, min;

        /*
         * We know min value when we add k to whole array---> tempmin. So we need to
         * find min element when we subtract k from whole array--->
         * so while searching for min element {arr[i]-k} we should search from--->
         * [1,arr.length-1] and similarly for max element we should search from--->
         * [0,arr.length-2] so that we can check the height difference between all pairs
         * of adjacent elements because adjacent elements will have small height
         * difference as the array is a sorted one.
         */

        for (int i = 0; i < n - 1; i++) {
            if (tempmax > (arr[i] + k)) {
                max = tempmax;
            } else {
                max = arr[i] + k;
            }
            // max = Math.max(tempmax, arr[i] + k); // can also be used

            if (tempmin < (arr[i + 1] - k)) {
                min = tempmin;
            } else {
                min = arr[i + 1] - k;
            }
            // min = Math.min(tempmin, arr[i + 1] - k); // can also be used

            if (min >= 0) {
                if (ans > (max - min)) {
                    ans = max - min;
                }
                // ans = Math.min(ans, max - min); // can also be used
            } else {
                min = arr[0] + k;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
