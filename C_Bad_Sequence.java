import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class C_Bad_Sequence {
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
        String str = "";
        do {
            str = sc.nextLine();
        } while (str.length() != n);

        Stack<Character> s = new Stack<Character>();
        s.push(str.charAt(0));
        for (int i = 1; i < n; i++) {
            if (!s.isEmpty() && str.charAt(i) == ')' && s.peek() == '(') {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }
        if (s.size() > 2 || s.size() == 1) {
            System.out.println("NO");
            return 0;
        }
        if (s.size() == 0) {
            System.out.println("YES");
            return 0;
        }
        if (s.size() == 2) {
            char c1 = s.pop();
            char c2 = s.pop();
            if (c1 == c2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
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
