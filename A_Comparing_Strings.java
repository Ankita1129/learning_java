import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Comparing_Strings {
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
        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.length() != str2.length()) {
            System.out.println("NO");
            return 0;
        }
        int count = 0;
        char c1 = 'a', c2 = 'a';
        boolean set = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i) && set == false) {
                c1 = str1.charAt(i);
                c2 = str2.charAt(i);
                set = true;
                count++;
            } else if (str1.charAt(i) != str2.charAt(i) && set != false) {
                if (c1 != str2.charAt(i) || c2 != str1.charAt(i)) {
                    System.out.println("NO");
                    return 0;
                }
                count++;
            }
        }
        if (count == 2) {
            System.out.println("YES");
            return 0;
        }
        System.out.println("NO");

        return 0;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
