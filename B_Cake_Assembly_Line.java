import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_Cake_Assembly_Line {
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
        int n = sc.nextInt();
        long w = sc.nextLong();
        long h = sc.nextLong();
        long[][] arrw = new long[n][2];
        long[][] arrh = new long[n][2];
        long[] arr1 = new long[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLong();
            arrw[i][0] = arr1[i] - w;
            arrw[i][1] = arr1[i] + w;
        }
        long[] arr2 = new long[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextLong();
            arrh[i][0] = arr2[i] - h;
            arrh[i][1] = arr2[i] + h;
        }
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        // long[] misr = new long[n];
        // long[] masp = new long[n];

        // for (int i = 0; i < n; i++) {
        // misr[i] = (long) (arrw[i][0] - arrh[i][0]);
        // masp[i] = (long) (arrw[i][1] - arrh[i][1]);
        // }

        for (int i = 0; i < n; i++) {
            max = (double) Math.max(max, (arrw[i][0] - arrh[i][0]));
        }

        for (int i = 0; i < n; i++) {
            min = (double) Math.min(min, (arrw[i][1] - arrh[i][1]));
        }

        if (max <= min) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        return 0;
    }

    public static void subSum(ArrayList<ArrayList<Long>> ans, int a[], ArrayList<Long> temp, int k, int start) {

        if (start > a.length || k < 0) {
            return;
        }

        if (k == 0) {
            ans.add(new ArrayList<Long>(temp));
            return;
        } else {
            for (int i = start; i < a.length; i++) {
                temp.add((long) (a[i]));
                subSum(ans, a, temp, k - a[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static long gcd(long a, long b) {
        if (a > b) {
            a = (a + b) - (a = b);
        }
        if (a == 0L) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void sort(int[] arr) {
        // because Arrays.sort() uses quick sort , Worst Complexity : o(N^2)

        ArrayList<Integer> ls = new ArrayList<>();
        for (int x : arr) {
            ls.add(x);
        }
        Collections.sort(ls);
        // Collections.sort(arrayList) : Uses Merge Sort : Complexity O(NlogN)

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ls.get(i);
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long sq = (long) Math.sqrt(n) + 1;

        for (long i = 5L; i <= sq; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
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
