import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Wrong_Addition {
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
        String a = sc.next();
        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1, j = s.length() - 1;

        String s1 = "", s2 = "";
        int val1 = 0, val2 = 0;
        boolean neg = false;
        while (i >= 0 && j >= 0) {
            if (neg) {
                if (j > 0) {
                    j--;
                    int val = Integer.valueOf(s.charAt(j) - '0');
                    val *= 10;
                    val += val2;
                    if (val >= 19) {
                        System.out.println(-1);
                        return 0;
                    }
                    if (val - val1 < 0) {
                        val2 = val;
                        neg = true;
                        continue;
                    } else {
                        sb.append(String.valueOf(val - val1));
                    }
                    i--;
                    j--;
                } else {
                    System.out.println(-1);
                    return 0;
                }
                neg = false;
            } else {
                val1 = Integer.valueOf(a.charAt(i) - '0');
                val2 = Integer.valueOf(s.charAt(j) - '0');
                if (val2 == 0 && j > 0) {
                    val2 = 10;
                    j--;
                    while (s.charAt(j) != '1') {
                        if (s.charAt(j) > '1') {
                            System.out.println(-1);
                            return 0;
                        }
                        val2 *= 10;
                        j--;
                    }
                    if (val2 > 18) {
                        System.out.println(-1);
                        return 0;
                    }
                }
                if (val2 - val1 < 0) {
                    neg = true;
                } else {
                    sb.append(String.valueOf(val2 - val1));
                    i--;
                    j--;
                }
            }
        }
        if (i != -1) {
            System.out.println(-1);
            return 0;
        }
        i = sb.length() - 1;

        while (i > 0 && sb.charAt(i) == '0') {
            i--;
        }
        String ss = sb.reverse().toString();
        ss = ss.substring(ss.length() - i - 1);
        if (j != -1) {
            ss = s.substring(0, j + 1) + ss;
        }
        System.out.println(ss);
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
