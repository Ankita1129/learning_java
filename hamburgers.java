import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
// import java.util.Collections;
import java.util.StringTokenizer;

public class hamburgers {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws Exception {
        int tc = sc.nextInt();
        solve();
        pw.close();
    }

    public static void solve() {
        String str = sc.next();
        int nb = sc.nextInt();
        int ns = sc.nextInt();
        int nc = sc.nextInt();
        int pb = sc.nextInt();
        int ps = sc.nextInt();
        int pc = sc.nextInt();
        long r = sc.nextLong();

        int b = 0, s = 0, c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B') {
                b++;
            } else if (str.charAt(i) == 'S') {
                s++;
            } else {
                c++;
            }
        }

        int cb = nb / b;
        int cs = ns / s;
        int cc = nc / c;
        long ans = Math.min(cb, cs);
        ans = Math.min(ans, cc);

        int lb = nb % b;
        int ls = ns % s;
        int lc = nc % c;

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