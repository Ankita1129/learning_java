import java.util.Scanner;

public class finding_pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long p = scanner.nextLong();
            // isPrime(p);
            if (isPrime(p)) {
                long[] A = new long[n];
                for (int i = 0; i < n; i++) {
                    A[i] = scanner.nextLong();
                }
                long[] B = new long[m];
                for (int i = 0; i < m; i++) {
                    B[i] = scanner.nextLong();
                }
                System.out.println("0");
                continue;
            }
            long[] A = new long[n];
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextLong();
            }
            long[] B = new long[m];
            for (int i = 0; i < m; i++) {
                B[i] = scanner.nextLong();
            }
            solve(A, B, n, m, p);
        }
        scanner.close();
    }

    public static boolean isPrime(long p) {
        if (p <= 1)
            return true;

        else if (p == 2)
            return false;

        else if (p % 2 == 0)
            return true;

        for (int i = 3; i <= Math.sqrt(p); i += 2) {
            if (p % i == 0)
                return true;
        }
        // scanner.close();
        return false;

    }

    public static void solve(long[] A, long[] B, int n, int m, long p) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((A[i] ^ B[j]) < p) {
                    if ((((A[i] ^ B[j]) * A[i]) - 1) % p == 0) {
                        count++;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
