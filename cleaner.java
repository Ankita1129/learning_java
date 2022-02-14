import java.util.Scanner;

public class cleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int rb = sc.nextInt();
            int cb = sc.nextInt();
            int rd = sc.nextInt();
            int cd = sc.nextInt();

            if (rb == rd || cb == cd) {
                System.out.println(0);
                continue;
            }
            int c1 = 0;
            int ans = 0;
            int dr = 0;
            int dc = 0;
            if (rb != n) {
                dr = 1;
            }
            if (cb != m) {
                dc = 1;
            }
            while (true) {
                if (rb == rd || cb == cd) {
                    ans = (c1);
                    break;
                }
                if (rb == n) {
                    dr = -1;
                }
                if (cb == m) {
                    dc = -1;
                }
                if (rb == 1) {
                    dr = 1;
                }
                if (cb == 1) {
                    dc = 1;
                }
                rb = rb + dr;
                cb = cb + dc;
                c1++;

            }
            System.out.println(ans);
        }
        sc.close();
    }
}