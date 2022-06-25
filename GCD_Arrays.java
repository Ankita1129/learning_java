import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class GCD_Arrays {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;

            if ((l == r) && (r > 1)) {
                pw.println("YES");
                continue;
            }
            if ((l == 1) && (r == 1)) {
                pw.println("NO");
                continue;
            }

            if ((l % 2 == 0) && (r % 2 == 0)) {
                ans = (r - l) / 2;
            } else {
                ans = (r - l) / 2;
                ans++;
            }
            if (k >= ans) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }
        pw.close();
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