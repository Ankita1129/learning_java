import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class c {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        loop: while (tc-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                arr[i] = s;
            }

            for (int i = 0; i < arr.length; i++) {
                String str = arr[i];
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if ((arr[j] + '0') == (str + '0')) {
                        count++;
                    }
                }
                if (count > (n / 2)) {
                    System.out.println(str);
                    continue loop;
                }
            }

            System.out.println(-1);

        }
    }

    public static void solve(char[] arr) {
        ArrayList<Character> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            a.add(c);

        }

        System.out.println();

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
