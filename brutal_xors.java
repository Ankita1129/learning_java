import java.util.Scanner;

public class brutal_xors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            long n = scanner.nextLong();
            if (n <= 0) {
                System.out.println(0);
                continue;
            }
            if (n == 2) {
                System.out.println(2);
                continue;
            }
            long temp = n;
            long c = 1, ans;
            while (temp > 1) {
                temp = temp / 2;
                c++;
            }
            long k = 1;
            while (c > 0) {
                k = k * 2;
                c--;
            }
            long p = k / 2;
            if (p == n) {
                ans = k - 1;
            } else {
                ans = k;
            }
            System.out.println(ans % 1000000007L);

        }

        scanner.close();

    }
}
