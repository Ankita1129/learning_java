
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
// import java.util.Collections;
import java.util.StringTokenizer;

public class Bishop {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static void solve() {
        String arr[] = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.next();
        }
        loop: for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                char c = arr[i].charAt(j);
                if (c == '#' && arr[i - 1].charAt(j - 1) == '#' && arr[i - 1].charAt(j + 1) == '#'
                        && arr[i + 1].charAt(j - 1) == '#' && arr[i + 1].charAt(j + 1) == '#') {
                    pw.println((i + 1) + " " + (j + 1));
                    break loop;
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