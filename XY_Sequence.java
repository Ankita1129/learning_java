import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class XY_Sequence {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] arr = new int[n + 1];
            arr[0] = 0;
            long sum = 0;
            for (int i = 1; i < (n + 1); i++) {
                if ((arr[i - 1] + x) > b) {
                    arr[i] = arr[i - 1] - y;
                    sum = sum + arr[i];
                } else {
                    arr[i] = arr[i - 1] + x;
                    sum = sum + arr[i];
                }
            }
            pw.println(sum);
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