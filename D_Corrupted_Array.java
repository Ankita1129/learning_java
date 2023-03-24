import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class D_Corrupted_Array {
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
        n += 2;
        ArrayList<Long> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextLong());
        }

        Collections.sort(al);
        // if last element is the sum
        long val1 = 0, val2 = 0;
        boolean set = false;
        long sum = al.get(al.size() - 1);
        long add = 0;
        for (int i = 0; i < al.size() - 1; i++) {
            add += al.get(i);
        }
        al.remove(al.get(al.size() - 1));
        // System.out.println(al);
        if (al.contains((add - sum))) {
            val1 = sum;
            val2 = (add - sum);
            set = true;
        }
        al.add(sum);
        // if second last element is the sum
        if (!set) {
            sum = al.get(al.size() - 2);
            add = 0;
            for (int i = 0; i < al.size() - 2; i++) {
                add += al.get(i);
            }
            al.remove(al.get(al.size() - 2));
            if (add == sum) {
                val1 = sum;
                val2 = al.get(al.size() - 1);
                set = true;
            }
            al.add(sum);
        }
        if (set) {
            boolean set1 = false, set2 = false;
            for (int i = 0; i < n; i++) {
                if (al.get(i) == val1 && set1 == false) {
                    set1 = true;
                    continue;
                } else if (al.get(i) == val2 && set2 == false) {
                    set2 = true;
                    continue;
                } else {
                    System.out.print(al.get(i) + " ");
                }
            }
            System.out.println();
            return 0;
        }
        System.out.println(-1);

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
