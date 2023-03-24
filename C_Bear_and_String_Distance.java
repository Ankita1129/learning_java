import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Bear_and_String_Distance {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = 1;
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static int solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = "";
        do {
            s = sc.nextLine();
        } while (s.length() != n);

        StringBuilder ans = new StringBuilder();
        int i = 0;
        int min = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            int val1 = s.charAt(i) - 'a';
            int val2 = 'z' - s.charAt(i);
            if (val1 > val2) {
                min = Math.min(k, val1);
                k -= min;
                ans.append((char) ((int) (s.charAt(i)) - min));
            } else {
                min = Math.min(k, val2);
                k -= min;
                ans.append((char) ((int) (s.charAt(i)) + min));
            }
            if (k == 0) {
                break;
            }
        }
        i++;
        while (i < n) {
            ans.append(s.charAt(i));
            i++;
        }
        if (k != 0) {
            System.out.println(-1);
            return 0;
        }
        System.out.println(ans.toString());

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
