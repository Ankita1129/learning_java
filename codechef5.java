import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class codechef5 {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws Exception {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static int solve() {
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < (n * 2); i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sub = 0;
        for (int i = 0; i < n; i++) {
            sub = arr[n - 1 - i] - arr[i];
            if (hm.containsKey(sub)) {
                if (hm.get(sub) == 2) {
                    pw.println("NO");
                    return 0;
                }
            }
        }

        pw.println();
        return 0;
    }

    public int findGCD(int a, int b) {
        BigInteger x = new BigInteger(Integer.toString(a));
        BigInteger y = new BigInteger(Integer.toString(b));
        return (y.gcd(x)).intValue();
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