import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_Reverse_Sort {
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
        String s = "";
        do {
            s = sc.nextLine();
        } while (s.length() != n);

        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> alll = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                all.add(0);
                alll.add(0);
            } else {
                all.add(1);
                alll.add(1);
            }
        }
        Collections.sort(all);
        if (all.equals(alll)) {
            System.out.println(0);
            return 0;
        }
        ArrayList<Integer> al0 = new ArrayList<Integer>();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                al1.add(i + 1);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                al0.add(i + 1);
            }
        }

        int i = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (i < al0.size() && i < al1.size() && al0.get(i) > al1.get(i)) {
            al.add(al0.get(i));
            al.add(al1.get(i));
            i++;
        }

        Collections.sort(al);
        System.out.println(1);
        System.out.print(al.size() + " ");
        for (i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
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
