import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class g {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            solve(arr);
        }
    }

    public static void solve(long[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            long a = arr[i] & arr[i + 1];
            long b = arr[i] | arr[i + 1];
            long c = (a * a) + (b * b);
            long d = (arr[i] * arr[i]) + (arr[i + 1] * arr[i + 1]);
            if (c > d) {
                arr[i] = a;
                arr[i + 1] = b;
            }
        }
        long sum = 0;
        for (int i = 0; i < (arr.length); i++) {
            sum = sum + (arr[i] * arr[i]);
        }
        System.out.println(sum);
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
