
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Ichihime_and_Triangle {
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        pw.println(b + a + d + " " + c + " " + (c));
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