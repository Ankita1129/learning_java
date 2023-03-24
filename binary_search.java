
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class binary_search {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int num = 1;
        int b = 0;
        int e = arr.length - 1;
        int k = 0;
        while (e - b >= 0) {
            k = (e + b) / 2;
            if (num > arr[k]) {
                b = k + 1;
            } else if (num == arr[k]) {
                pw.println(k);
                k = -1;
                break;
            } else if (num < arr[k]) {
                e = k - 1;
            } else {
                k = -1;
                pw.println(-1);
            }
        }
        if (k != -1) {
            pw.println(-1);
        }
        pw.close();
    }

    public static void solve() {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();
        k--;
        long sum = ((k + 1) * b) + k;
        if ((sum > s) && ((sum - s) <= k)) {
            sum = s;
        }
        long[] ans = new long[n];
        ans[0] = sum;
        int count = 0;
        if ((s - sum) >= (k)) {
            for (int i = 1; i < n; i++) {
                ans[i] = k;
                sum += k;
                if (((s - sum) <= k) && count == 0) {
                    k = (int) (s - sum);
                    count++;
                } else if (s == sum) {
                    break;
                }
            }
        } else {
            ans[1] = s - sum;
        }
        if (s == sum) {
            for (int i = 0; i < n; i++) {
                pw.print(ans[i] + " ");
            }
            pw.println();
        } else {
            pw.println(-1);
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
