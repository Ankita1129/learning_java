import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = "";
        do {
            s = sc.next();
        } while (s.length() != n);
        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(s.charAt(i));
            temp.add(s.charAt(i));
        }
        int max = 0;
        ArrayList<Integer> cList = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            int count = 1;
            loop: while ((s.charAt(i) + '0') == (s.charAt(i + 1) + '0') && count < m) {
                count++;
                i++;
                if (i == al.size()) {
                    break loop;
                }
            }
            if (count == m && count > max) {
                max = count;
                cList.add(count);
            }
        }
        System.out.println(cList);
    }

    public static void solve(int[] arr, char[] s, int n) {

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
