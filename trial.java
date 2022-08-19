import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class trial {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws Exception {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static void solve() {
        long x = sc.nextLong();
        long y = sc.nextLong();
        long a = 0;
        long b = 0;
        if ((x & 1) == 0) {
            x /= 2;
            a = x;
            b = x;
        } else {
            x /= 2;
            a = x;
            b = x + 1;
        }
        long c = b + 1;
        long d = 0;
        int count = 0;
        if ((y / c) < b) {
            pw.println(-1);
            count = 50;
        } else {
            for (long i = c; i < (y / c); i++) {
                if ((y % i) == 0) {
                    c = i;
                    d = y / i;
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            c = a - 1;
            for (int i = 1; i < c; i++) {
                if ((y % i) == 0) {
                    c = i;
                    d = y / i;
                    count++;
                    break;
                }
            }

        }
        if (count == 1) {
            pw.println(a + " " + b);
            pw.println(Math.min(c, d) + " " + Math.max(c, d));
        }

    }

    static boolean isEven(int n) {
        if ((n ^ 1) == n + 1) {
            return true;
        } else {
            return false;
        }
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