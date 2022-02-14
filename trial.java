import java.util.HashSet;
import java.util.Scanner;

public class trial {
    public static void hashset(long[] arr, int k, int N) {
        HashSet<Long> set = new HashSet<>();
        for (long element : arr) {
            set.add(element);
        }
        long distinct[] = new long[set.size()];
        for (long val : set) {
            distinct[k] = val;
            k++;
        }
        solve(distinct, arr, k, N);
    }

    public static void solve(long distinct[], long arr[], int k, int N) {
        int p = 0;
        long ans = 0;
        long count = 0;
        int j = 0;
        int temp = N;
        for (int i = j; i < temp; i++) {
            long x = distinct[p];
            if (arr[i] == x) {
                count++;
            }

            // System.out.println(x + " : " + i + " : " + arr[i]);

            if (i == (temp - 1)) {
                if (count == x) {
                    ans = ans + x;
                    // System.out.println(ans);
                    if (i == (temp - 1) && p == (k - 1)) {
                        p = 0;
                        i = j - 1;
                        count = 0;
                        temp = temp - 1;
                        // System.out.println();
                        if (i >= temp) {
                            j = j + 1;
                            i = j - 1;
                            temp = N;
                        }
                        continue;
                    } else if (p < (k - 1)) {
                        i = j - 1;
                        count = 0;
                        p++;
                        // System.out.println();
                        continue;
                    }
                }
                if (p < (k - 1)) {
                    p++;
                    i = j - 1;
                    count = 0;
                    // System.out.println();
                }
                if (i == (temp - 1) && p == (k - 1)) {
                    p = 0;
                    count = 0;
                    i = j - 1;
                    temp = temp - 1;
                    // System.out.println();
                    if (temp <= j) {
                        j = j + 1;
                        i = j - 1;
                        temp = N;
                    }
                    // System.out.println();
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextLong();
            }
            int k = 0;
            hashset(arr, k, N);
        }
        scanner.close();
    }
}