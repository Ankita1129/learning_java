
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
// import java.util.*;
// import java.util.Collections;
import java.util.StringTokenizer;

public class buttons {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = n - 2;
        int sum = 2 * n - 1;
        for (int i = 2; i < n; i++) {
            sum += (i * k);
            k--;
        }

        pw.println(sum);
        pw.close();
    }

    public static void solve() {
        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextLine());
        int a = sb.indexOf("1");
        int b = sb.lastIndexOf("1");
        String str = sb.toString();
        int count = 0;
        for (int i = a; i < b; i++) {
            if (str.charAt(i) == '0') {
                count++;
            }
        }

        pw.println(count);
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
