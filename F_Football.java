import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class F_Football {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = 1;
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static int solve() {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n == 1) {
            if (a == b) {
                pw.println(1);
            } else {
                pw.println(0);
            }
            pw.println(a + ":" + b);
            return 0;
        }
        if (a + b >= n) {
            pw.println(0);
            while (n > 2 && a > 0) {
                pw.println(1 + ":" + 0);
                a--;
                n--;
            }
            if (a == 0) {
                while (n > 1 && b > 0) {
                    pw.println(0 + ":" + 1);
                    b--;
                    n--;
                }
                if (n > 0) {
                    pw.println(0 + ":" + b);
                }
                return 0;
            } else {
                if (b == 0) {
                    pw.println(1 + ":" + 0);
                    a--;
                    pw.println(a + ":" + 0);
                } else {
                    pw.println(a + ":" + 0);
                    pw.println(0 + ":" + b);
                }
                return 0;
            }
        } else {
            pw.println(n - a - b);
            while (a > 0) {
                pw.println(1 + ":" + 0);
                a--;
                n--;
            }
            while (b > 0) {
                pw.println(0 + ":" + 1);
                b--;
                n--;
            }
            while (n > 0) {
                pw.println(0 + ":" + 0);
                n--;
            }
            return 0;
        }
        // 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
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
