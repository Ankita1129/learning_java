import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class Gregor_and_Cryptography {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        FastReader s = new FastReader();
        int tc = s.nextInt();
        while (tc-- > 0) {
            int p = s.nextInt();
            pw.println("2 " + (p - 1));
        }
        pw.close();
    }

    public static int[] sorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static boolean solve(int[] arr, long sumr, long sumb, int n) {
        for (int i = 1; i <= (n / 2); i++) {
            sumr += arr[n - i];
            sumb += arr[i];
            if (sumr > sumb) {
                return true;
            }
        }
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
