
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class leetcode {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        String s = "            the    sky    is     blue      ";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (((int) (s.charAt(i))) != 32) {
                sb.append(s.charAt(i));
                // System.out.println(sb.toString());
                count++;
                size++;
            } else if ((((int) (s.charAt(i))) == 32) && (count != 0) && (((int) (s.charAt(i - 1))) != 32)) {
                sb.append(" ");
                // System.out.println(sb.toString());
                count = 0;
                size++;
            }
        }
        if (((int) (sb.charAt(size - 1))) == 32) {
            sb.delete(size - 1, size);
            size--;
        }
        // System.out.println(sb.toString());
        StringBuilder ans = new StringBuilder();
        count = size;
        for (int i = (size - 1); i >= 0; i--) {
            if (((int) (sb.charAt(i))) == 32) {
                ans.append(sb.substring((i + 1), count));
                ans.append(" ");
                // System.out.println(ans.toString());
                count = i;
            }
        }
        ans.append(sb.substring(0, count));
        System.out.println(ans.toString());
        pw.close();
    }

    public static void solve() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        HashMap<Integer, Character> hm = new HashMap<>();

        for (int i = 0; i < key.length(); i++) {
            if (!hm.containsValue(key.charAt(i))) {
                hm.put(hm.size(), key.charAt(i));
            }
        }

        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            ans += hm.get((int) (message.charAt(i)) - 96);
            pw.println(ans);
        }
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