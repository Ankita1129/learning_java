import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_TPrimes {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int n = sc.nextInt();
        long a = 0, b = 0, val = 0;
        for (int i = 0; i < n; i++) {
            val = sc.nextLong();
            a = (long) (Math.sqrt(val));
            b = a * a;
            if (b == val) {
                if (isPrime(a)) {
                    pw.println("YES");
                    continue;
                }
            }
            pw.println("NO");
        }
        pw.close();
    }

    public static int solve() {
        int n = sc.nextInt();
        long[] arr = new long[n];
        long a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            a = (long) (Math.sqrt(arr[i]));
            b = a * a;
            if (b == arr[i]) {
                if (isPrime(a)) {
                    pw.println("YES");
                    continue;
                }
            }
            pw.println("NO");
        }
        // long a = 0, b = 0;
        // for (int i = 0; i < n; i++) {
        // a = (long) (Math.sqrt(arr[i]));
        // b = a * a;
        // if (b == arr[i]) {
        // if (isPrime(a)) {
        // System.out.println("YES");
        // continue;
        // }
        // }
        // System.out.println("NO");
        // }
        return 0;
    }

    static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; (i * i) <= n; i += 6) {
            if ((n % i == 0) || (n % (i + 2) == 0)) {
                return false;
            }
        }
        return true;
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
