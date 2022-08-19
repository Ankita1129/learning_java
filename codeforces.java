
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class codeforces {
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
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        int[] aq = new int[2 * q];
        for (int i = 0; i < (2 * q); i++) {
            aq[i] = sc.nextInt();
        }
        if (max == a[0]) {
            for (int i = 0; i < (2 * q); i += 2) {
                if (aq[i] - 1 == 0) {
                    pw.println(aq[i + 1]);
                } else {
                    pw.println(0);
                }
            }
        } else {
            for (int i = 0; i < (2 * q); i += 2) {
                if (max > a[aq[i] - 1]) {
                    pw.println(0);
                } else {
                    pw.println(aq[i + 1] - aq[i] + 2);
                }
            }
        }
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
