import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Serval_and_Inversion_Magic {
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
        int length = sc.nextInt();
        String string = "";
        do {
            string = sc.nextLine();
        } while (string.length() != length);

        boolean first_different = false, second_different = false;
        int j = length - 1;
        for (int i = 0; i < length / 2; i++) {
            if (first_different) {
                if (string.charAt(i) == string.charAt(j - i)) {
                    second_different = true;
                } else if (string.charAt(i) != string.charAt(j - i) && second_different) {
                    System.out.println("NO");
                    return 0;
                }
            } else {
                if (string.charAt(i) != string.charAt(j - i)) {
                    first_different = true;
                }
            }
        }
        System.out.println("YES");
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
