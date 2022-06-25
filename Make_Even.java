import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Make_Even {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        loop: while (tc-- > 0) {
            int n = sc.nextInt();
            if ((n % 2) == 0) {
                pw.println(0);
                continue loop;
            }
            String str = String.valueOf(n);
            char a = str.charAt(0);
            if (a % 2 == 0) {
                pw.println(1);
                continue loop;
            }
            for (int i = 0; i < str.length(); i += 1) {
                a = str.charAt(i);
                if (a % 2 == 0) {
                    pw.println(2);
                    continue loop;
                }
            }
            pw.println("-1");
        }
        pw.close();
    }

    public static int solve(int n, long s) {
        int cnt = 0;
        int a = 1;
        loop: for (int i = 0; i <= n; i++) {
            if (i > n) {
                break loop;
            }
            if (s >= (n * n)) {
                s = s - (n * n);
                cnt++;
                continue loop;
            }
            if (a < n) {
                s = s - a;
                a++;
            }
        }

        return cnt;
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
