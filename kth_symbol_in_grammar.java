import java.util.Scanner;

public class kth_symbol_in_grammar {
    public static int kthGrammar(int n, int k) {
        String str = fxn("", n);
        return Integer.valueOf(str.charAt(k - 1) - '0');
    }

    public static String fxn(String s, int n) {
        if (n == 1) {
            return "0";
        }
        String str = fxn(s, n - 1);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                res += "01";
            } else {
                res += "10";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = kthGrammar(n, k);
        System.out.println(ans);
        sc.close();
    }
}