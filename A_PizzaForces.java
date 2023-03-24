import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_PizzaForces {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static int solve() {
        long n = sc.nextLong();
        long a = 0, b = 0, c = 0;
        a = n % 6;
        if (a == 0) {
            a = n / 6;
            System.out.println(a * 15);
            return 0;
        }

        b = n % 8;
        if (b == 0) {
            b = n / 8;
            System.out.println(b * 20);
            return 0;
        }

        c = n % 10;
        if (c == 0) {
            c = n / 10;
            System.out.println(c * 25);
            return 0;
        }
        if (n < 6) {
            System.out.println(15);
            return 0;
        }

        System.out.println(((n + 1) / 2) * 5);

        return 0;
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
