import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Prefix_and_Suffix_Array {
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
        int len = (2 * n) - 2;
        String[] arr = new String[len];
        int[] ans = new int[2];
        int k = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
            if (arr[i].length() == n - 1) {
                ans[k] = i;
                k++;
            }
        }

        StringBuilder sb1 = new StringBuilder(arr[ans[0]]);
        sb1.reverse();
        String s1 = arr[ans[1]];
        String s2 = sb1.toString();
        if (s1.equals(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

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
