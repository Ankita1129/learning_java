import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringBuffer {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String s = sc.next();
        StringBuffer S = new StringBuffer(s);
        solve(S, s);
    }

    public static void solve(StringBuffer S, String s) {
        StringBuffer temp = new StringBuffer(S);

        int count = 0;
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            if (temp.charAt(j) == 'a') {
                temp = temp.delete(j, (j + 1));
                count++;
            } else {
                j++;
            }

        }
        // System.out.println("temp: " + temp);
        if (count == (S.length())) {
            System.out.println(S);
        } else if ((temp.length() % 2) == 0) {
            StringBuffer S1 = new StringBuffer(temp.delete((temp.length() / 2), temp.length()));
            // System.out.println("S1: " + S1);
            StringBuffer S2 = new StringBuffer((S.delete(((S.length()) - (temp.length())), S.length())));
            // System.out.println("S2: " + S2);
            // System.out.println((S2.append(S1)));
            String S3 = (S2.append(S1)).toString();
            if ((S3).equals(s)) {
                System.out.println(S);
            } else {
                System.out.println(":(");
            }
        } else {
            System.out.println(":(");
        }
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
