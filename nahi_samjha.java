
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

class nahi_samjha {
    static PrintWriter pw = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) {
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            solve();
        }
        pw.close();
    }

    public static void solve() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (hm.containsKey(arr[i])) {
                count = hm.get(arr[i]);
                hm.put(arr[i], count + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        int maxValueInMap1 = (Collections.max(hm.values()));
        count = 0;
        for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxValueInMap1) {
                hm.remove(entry.getKey());
            }
        }
        int maxValueInMap2 = (Collections.max(hm.values()));
        if (maxValueInMap1 == maxValueInMap2) {
            pw.println(maxValueInMap1);
        } else {
            if ((maxValueInMap1 & 1) == 0) {
                maxValueInMap1 /= 2;
            } else {
                maxValueInMap1 /= 2;
                maxValueInMap1++;
            }
            if (maxValueInMap2 > maxValueInMap1) {
                pw.println(maxValueInMap2);
            } else {
                pw.println(maxValueInMap1);
            }
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