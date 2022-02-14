import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        for (int c = 0; c < n; c++) {
            String s = "";
            do {
                s = sc.next();
            } while (s.length() != m);
            al.add(s);
            temp.add(s);
        }
        int j = 0;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            String str2 = al.get(i);
            String str1 = reverse(str2);
            temp.remove(str2);
            if (temp.contains(str1)) {
                ans.add(j, str2);
                ans.add((j + 1), str1);
                j++;
                temp.remove(str1);
            }
        }
        for (int i = 0; i < al.size(); i++) {
            String str1 = al.get(i);
            if (isPalindrome(str1)) {
                int p = ans.size() / 2;
                ans.add(p, str1);
                break;
            }
        }
        if (ans.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(ans.size() * m);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + "");
            }
            System.out.println();
        }
    }

    public static String reverse(String str) {
        // int count = 0;
        String ans = ""; //
        char ch;
        int N = str.length();
        for (int i = 0; i < N; i++) {
            ch = str.charAt(i);
            ans = ch + ans;
        }
        return ans;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (j >= i) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
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