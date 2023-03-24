
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class swt {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        int i = 0, j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] >= 0) {
                i = k;
                j = k - 1;
                break;
            }
        }
        int count = 0;
        int n = nums.length;
        int[] ans = new int[n];
        if (nums[i] == 0) {
            ans[count] = 0;
            count++;
            i++;
        }

        while (count < n) {
            if ((j >= 0) && (i < n) && (Math.abs(nums[j]) <= nums[i])) {
                ans[count] = nums[j] * nums[j];
                j--;
                count++;
            } else if ((j >= 0) && (i < n) && (Math.abs(nums[j]) > nums[i])) {
                ans[count] = nums[i] * nums[i];
                i++;
                count++;
            } else if (j <= -1 && i < n) {
                ans[count] = nums[i] * nums[i];
                i++;
                count++;
            } else if (j >= 0 && i >= n) {
                ans[count] = nums[j] * nums[j];
                j--;
                count++;
            } else {
                break;
            }
        }
        for (int p = 0; p < count; p++) {
            pw.print(ans[p] + " ");
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

        // https://youtube.com/shorts/V7A-NnhjxbM?feature=share

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
