
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class leetcode {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws Exception {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        HashMap<Character, Character> hm = new HashMap<>();
        int p = 97;
        for (int i = 0; i < key.length(); i++) {
            if ((key.charAt(i) != ' ') && (!hm.containsKey(key.charAt(i)))) {
                hm.put(key.charAt(i), (char) (p));
                p++;
            }
        }

        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                ans += ' ';
                continue;
            }
            ans += hm.get(message.charAt(i));
        }
        pw.println(ans);
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