import java.util.HashSet;
import java.util.Scanner;

public class negate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            // int m = 0;
            for (int i = 0; i < n; i++) {
                int k = set1.size();
                boolean neg1 = set2.contains(-1 * arr[i]);
                if (neg1) {
                    continue;
                } else {
                    if (i != 0) {
                        set1.add(arr[i]);
                    }
                }
                if (i == 0) {
                    set1.add(arr[i]);
                }
                // int count = m + set1.size();
                boolean neg2 = set1.contains(-1 * arr[i]);
                if (neg2) {
                    continue;
                } else {
                    if (k == set1.size()) {
                        set2.add(arr[i]);
                        // m++;
                    }
                }

            }
            int ans = set1.size() + set2.size();
            boolean a = set1.contains(0);
            boolean b = set2.contains(0);
            if (a == true && b == true) {
                ans = ans - 1;
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
