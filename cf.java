import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class cf {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws Exception {
        solve();
        pw.close();
    }

    static int solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (a < b) {
            sb.append('1');
            b--;
            for (int i = 1; i < (a + b); i++) {
                if ((i & 1) != 0) {
                    sb.append('0');
                    a--;
                    count = -1;
                } else {
                    sb.append('1');
                    b--;
                    count = -2;
                }
                x--;
                if (x == 0) {
                    break;
                }
            }
            StringBuilder ans = new StringBuilder();
            if (count == -1) {
                while (a > 0) {
                    sb.append('0');
                    a--;
                }
                ans = sb.reverse();
                while (b > 0) {
                    ans.append('1');
                    b--;
                }
            }
            if (count == -2) {
                while (b > 0) {
                    sb.append('1');
                    b--;
                }
                ans = sb.reverse();
                while (a > 0) {
                    ans.append('0');
                    a--;
                }
            }
            pw.println(ans.toString());
        } else {
            sb.append('0');
            a--;
            for (int i = 1; i < (a + b); i++) {
                if ((i & 1) != 0) {
                    sb.append('1');
                    b--;
                    count = -1;
                } else {
                    sb.append('0');
                    a--;
                    count = -2;
                }
                x--;
                if (x == 0) {
                    break;
                }
            }
            StringBuilder ans = new StringBuilder();
            if (count == -1) {
                while (a > 0) {
                    sb.append('0');
                    a--;
                }
                ans = sb.reverse();
                while (b > 0) {
                    ans.append('1');
                    b--;
                }
            }
            if (count == -2) {
                while (b > 0) {
                    sb.append('1');
                    b--;
                }
                ans = sb.reverse();
                while (a > 0) {
                    ans.append('0');
                    a--;
                }
            }
            pw.println(ans.toString());
        }
        return 0;
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
