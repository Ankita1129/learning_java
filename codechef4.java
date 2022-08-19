import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class codechef4 {
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
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        n += m;
        n -= 2;
        if (n <= x) {
            x -= n;
            x++;
            if ((x & 1) == 0) {
                if (y > 1) {
                    pw.println("YES");
                } else {
                    pw.println("NO");
                }
            } else {
                if (y > 0) {
                    pw.println("YES");
                } else {
                    pw.println("NO");
                }
            }
        } else {
            n -= x;
            if (n < y) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
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