import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Increments {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws Exception {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    static void solve() {
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr[0] % 2 == 0) {
            count1++;
        }
        if ((n >= 2) && (arr[1] % 2 == 0)) {
            count2++;
        }
        for (int i = 0; i < n; i++) {
            if (count1 == 1 && i % 2 == 0 && arr[i] % 2 != 0) {
                break;
            } else if (count2 == 1 && i % 2 != 0 && arr[i] % 2 != 0) {
                break;
            } else if (count2 == 0 && i % 2 != 0 && arr[i] % 2 == 0) {
                break;
            } else if (count1 == 0 && i % 2 == 0 && arr[i] % 2 == 0) {
                break;
            } else if (i == (n - 1)) {
                pw.println("YES");
                count1 = 50;
            }
        }
        if (count1 != 50) {
            pw.println("NO");
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