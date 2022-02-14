import java.util.Arrays;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int l = scanner.nextInt();
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (l == m && m == n) {
                if (m % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else {
                    System.out.println("NO");
                    continue;
                }
            } else if (l == m && m != n) {
                if (n % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else {
                    System.out.println("NO");
                    continue;
                }
            } else if (l == n && n != m) {
                if (m % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else {
                    System.out.println("NO");
                    continue;
                }
            } else if (n == m && m != l) {
                if (l % 2 == 0) {
                    System.out.println("YES");
                    continue;
                } else {
                    System.out.println("NO");
                    continue;
                }
            }

            int arr[] = new int[3];
            arr[0] = l;
            arr[1] = m;
            arr[2] = n;
            Arrays.sort(arr);
            if ((arr[0] + arr[1]) == arr[2]) {
                System.out.println("YES");
                continue;
            } else {
                System.out.println("NO");
                continue;
            }
        }
        scanner.close();
    }
}
