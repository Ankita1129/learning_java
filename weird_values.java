import java.util.HashSet;
import java.util.Scanner;

public class weird_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextLong();
            }
            HashSet<Long> set = new HashSet<>();
            for (long element : arr) {
                set.add(element);
            }
            int k = 0;
            long distinct[] = new long[set.size()];
            for (long val : set) {
                distinct[k] = val;
                k++;
            }
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
                if (i == (temp - 1)) {
                    if (count == x) {
                        ans = ans + x;
                        if (p < (k - 1)) {
                            i = j - 1;
                            count = 0;
                            p++;
                            continue;
                        }
                    }
                    if (p < (k - 1)) {
                        p++;
                        i = j - 1;
                        count = 0;
                    }
                    if (i == (temp - 1) && p == (k - 1)) {
                        p = 0;
                        count = 0;
                        i = j - 1;
                        temp = temp - 1;
                        if (temp <= j) {
                            j = j + 1;
                            i = j - 1;
                            temp = N;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}