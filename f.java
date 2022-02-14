import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class f {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        for (int c = 0; c < tc; c++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            solve(n, m);
        }
    }

    public static void solve(long n, long m) {
        long count = 0, k = 0, i = n;
        while (k < 1000) {
            if (i > m) {
                break;
            }
            if (isPrime(i)) {
                count = count + i;
            }
            i++;
            k++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(long i) {
        if (i <= 1) {
            return false;
        } else if (i == 2 || i == 3) {
            return true;
        } else if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        for (long j = 5; j <= Math.sqrt(i); j += 6) {
            if (i % j == 0 || i % (j + 2) == 0)
                return false;
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
