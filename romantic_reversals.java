import java.util.Scanner;

public class romantic_reversals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            // Input string of length n
            String s = "";
            do {
                s = scanner.nextLine();
            } while (s.length() != n);
            System.out.println(s);

            String temp = s;
            String ans = "";
            char ch;
            for (int i = k; i > 0; i--) {
                String str = temp.substring(0, i);
                System.out.println(str);
                for (int j = 0; j < k; j++) {
                    ch = str.charAt(j);
                    ans = ch + ans;
                    System.out.println(ans);
                }
                temp = ans;
                ans = "";
                System.out.println(temp);
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
