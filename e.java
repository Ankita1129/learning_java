import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class e {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        long m = sc.nextLong();
        if (m == 0 || n <= 0 || m > ((n * (n - 1)) / 2)) {
            System.out.println(n);
        }
        // int k = 0;
        int count = 0;
        ArrayList<ArrayList<Long>> a = new ArrayList<ArrayList<Long>>();
        for (long i = 0; i < (m); i++) {

        }
        System.out.println(m - count);
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
