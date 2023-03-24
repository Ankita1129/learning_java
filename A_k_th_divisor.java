import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A_k_th_divisor {
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
        long n = sc.nextLong();
        int k = sc.nextInt();

        Set<Long> set = new HashSet<Long>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(i);
            }
        }

        ArrayList<Long> al = new ArrayList<>();
        for (long a : set) {
            al.add(a);
        }

        // set.clear();

        for (long a : al) {
            set.add((long) (n / a));
            // i--;
            // if (i == 0) {
            // break;
            // }
        }
        al.clear();
        // System.out.println(al);
        // System.out.println(set);
        for (long a : set) {
            al.add(a);
        }

        // long[] a2 = new long[set.size()];
        // int j = 0;
        // for (long a : set) {
        // a2[j] = a;
        // j++;
        // }

        Collections.sort(al);

        // System.out.println(al);
        k--;
        if ((al.size()) < (k + 1)) {
            System.out.println(-1);
        } else {
            System.out.println(al.get(k));
            // if (k < a1.length) {
            // System.out.println(a1[k]);
            // } else {
            // k -= a1.length;
            // System.out.println(a2[k]);
            // }
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
