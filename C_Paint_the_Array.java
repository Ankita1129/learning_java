import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class C_Paint_the_Array {
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

        // long[] arr = new long[n];
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        long a = arr.get(0), b = arr.get(1);
        for (int i = 0; i < n; i++) {
            long val = arr.get(i);
            if (i % 2 == 0) {
                a = gcd(a, val);
            } else {
                b = gcd(b, val);
            }
        }
        if (a == 1 && b == 1) {
            System.out.println(0);
            return 0;
        }
        if (arr.size() == 2) {
            if (arr.get(0) != arr.get(1)) {
                System.out.println(Math.max(arr.get(0), arr.get(1)));
                return 0;
            } else {
                System.out.println(0);
                return 0;
            }
        }

        int ans = -1;
        if (a != 1) {
            for (int i = 1; i < n; i += 2) {
                if (arr.get(i) % a == 0) {
                    ans = 0;
                }
            }
            if (ans == -1) {
                System.out.println(a);
                return 0;
            }
        }
        if (b != 1) {
            for (int i = 0; i < n; i += 2) {
                if (arr.get(i) % b == 0) {
                    System.out.println(0);
                    return 0;
                }
            }
            System.out.println(b);
            return 0;
        }
        System.out.println(0);
        return 0;
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
