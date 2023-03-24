import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Marin_and_Photoshoot {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.flush();
    }

    static void solve() {
        int n = sc.nextInt();
        String s = "";
        do {
            s = sc.nextLine();
        } while (s.length() != n);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (((i + 1) < n) && (s.charAt(i + 1) == '0')) {
                    ans = ans + 2;
                    continue;
                }
                if (((i + 1) < n) && (s.charAt(i + 1) == '1')) {
                    if (((i + 2) < n) && (s.charAt(i + 2) == '1')) {
                        continue;
                    }
                    if (((i + 2) < n) && (s.charAt(i + 2) == '0')) {
                        ans = ans + 1;
                        continue;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        pw.println(ans);

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