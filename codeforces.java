import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class codeforces {
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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        if ((arr[0] < arr[1]) && (arr[2] < arr[3]) && (arr[0] < arr[2]) && (arr[1] < arr[3])) {
            pw.println("YES");
            return 0;
        }

        for (int i = 0; i <= arr.length; i++) {
            int temp = arr[3];
            arr[3] = arr[1];
            arr[1] = arr[0];
            arr[0] = arr[2];
            arr[2] = temp;

            if ((arr[0] < arr[1]) && (arr[2] < arr[3]) && (arr[0] < arr[2]) && (arr[1] < arr[3])) {
                pw.println("YES");
                return 0;
            }
        }
        if ((arr[0] < arr[1]) && (arr[2] < arr[3]) && (arr[0] < arr[2]) && (arr[1] < arr[3])) {
            pw.println("YES");
            return 0;
        }
        pw.println();

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
