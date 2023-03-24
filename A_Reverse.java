import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A_Reverse {
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
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pq.add(arr[i]);
        }
        int val = 0;
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            if (pq.peek() == arr[i]) {
                pq.remove();
            } else {
                val = pq.peek();
                break;
            }
        }
        // if (i == n) {
        // for (int k = 0; k < n; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // System.out.println();
        // return 0;
        // }

        if (val != 0) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] == val) {
                    break;
                }
            }
        }

        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }
        if (n == i) {
            System.out.println();
            return 0;
        }
        for (int k = j; k >= i; k--) {
            System.out.print(arr[k] + " ");
        }
        for (int k = j + 1; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

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
