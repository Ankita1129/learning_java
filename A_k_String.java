import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A_k_String {
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
        int k = sc.nextInt();
        String s = sc.next();
        int n = s.length();

        String[] arr = new String[k];
        Arrays.fill(arr, "");
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int a = entry.getValue();
            if (a % 2 != 0 || a % k != 0) {
                System.out.println(-1);
                return 0;
            }
            int i = 0;
            char c = entry.getKey();
            while (a > 0) {
                arr[i] += "" + (c);
                i++;
                if (i == n) {
                    i = 0;
                }
                a--;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) {
            ans.append(arr[i]);
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
