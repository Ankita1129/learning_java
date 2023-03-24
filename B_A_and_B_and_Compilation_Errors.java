import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_A_and_B_and_Compilation_Errors {
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
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            if (hm.containsKey(a)) {
                hm.put(a, hm.get(a) - 1);
            }
            if (hm.containsKey(a) && hm.get(a) == 0) {
                hm.remove(a);
            }
        }
        // System.out.println(hm);
        int p = 0, q = 0;
        for (int a : hm.keySet()) {
            p = a;
        }
        hm.clear();
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n - 2; i++) {
            int a = sc.nextInt();
            if (hm.containsKey(a)) {
                hm.put(a, hm.get(a) - 1);
            }
            if (hm.containsKey(a) && hm.get(a) == 0) {
                hm.remove(a);
            }
        }
        // System.out.println(hm);
        for (int a : hm.keySet()) {
            if (p != a) {
                q = a;
                break;
            }
        }
        if (q == 0) {
            q = p;
        }
        System.out.println(p);
        System.out.println(q);
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
