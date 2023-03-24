import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
// import java.util.*;

public class codechef1 {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static int solve() {
        int n = sc.nextInt();
        int qe = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] q = new int[qe * 3];
        for (int i = 0; i < (qe * 3); i++) {
            q[i] = sc.nextInt();
        }

        long[] pre = new long[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] + pre[i - 1];
        }
        // int[] suf = new int[n];
        // suf[n - 1] = arr[n - 1];
        // for (int i = n - 2; i >= 0; i--) {
        // suf[i] = arr[i] + suf[i + 1];
        // }

        long last = 0;
        if (n - 1 >= 0) {
            last = pre[n - 1];
        }
        for (int i = 0; i < (qe * 3); i += 3) {
            int l = q[i];
            int r = q[i + 1];
            int k = q[i + 2];

            long sum = last - pre[r - 1];
            if (l - 2 >= 0) {
                sum += pre[l - 2];
            }
            sum += (k * (r - l + 1));
            if (sum % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }

        return 0;
    }

    public int gcd(int a, int b) {
        BigInteger x = new BigInteger(Integer.toString(a));
        BigInteger y = new BigInteger(Integer.toString(b));
        return (y.gcd(x)).intValue();
    }

    static boolean isEven(int n) {

        if ((n ^ 1) == n + 1)
            return true;
        else
            return false;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}