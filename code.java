import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class code {
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean k = false;
        arr[0] = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (count == 0 && arr[i] >= arr[i - 1]) {
                count++;
                k = true;
                continue;
            }
            if (count != 0 && arr[i] >= arr[i - 1]) {
                k = true;
            } else {
                count = -1;
                k = false;
            }
        }
        if (count == 1) {
            if (k) {
                pw.println("YES");
                return 0;
            }
        }
        int[] pre = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            pre[i] = arr[i] - arr[i + 1];
        }
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n - 1; i++) {
            if (pre[i] >= 0 && count1 == 0) {
                count1++;
                continue;
            }
            if (count1 != 0 && pre[i] < 0) {
                count2++;
            }
        }
        return 0;
    }

    // public int findGCD(int a, int b) {
    // BigInteger x = new BigInteger(Integer.toString(a));
    // BigInteger y = new BigInteger(Integer.toString(b));
    // return (y.gcd(x)).intValue();
    // }

    // static boolean isEven(int n) {

    // if ((n ^ 1) == n + 1)
    // return true;
    // else
    // return false;
    // }

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