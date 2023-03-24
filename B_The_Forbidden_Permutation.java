import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_The_Forbidden_Permutation {
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
        int m = sc.nextInt();
        int d = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            hm.put(p[i], i);
        }
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m - 1; i++) {
            max = Math.max(max, (hm.get(arr[i]) - hm.get(arr[i + 1])));
        }

        if (max > d) {
            System.out.println(0);
        } else {

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
