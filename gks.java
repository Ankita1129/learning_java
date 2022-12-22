import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Solution {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve(i + 1);
        }
        pw.close();
    }

    public static int solve(int t) {
        int l = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            c[i] = sc.next().charAt(0);
        }

        int curr = arr[0], ans = 0;
        for (int i = 1; i < n; i++) {
            if (c[i] != c[i - 1]) {
                ans += (curr / l);
                curr = curr % l;
                curr *= (-1);
            }
            curr += arr[i];
        }
        ans += (curr / l);

        System.out.println("Case #" + t + ": " + ans);
        return 0;
    }

    public int findGCD(int a, int b) {
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