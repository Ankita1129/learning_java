import java.util.Scanner;

public class chef_loves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int count1 = 0;
            int count0 = 0;
            int n = scanner.nextInt();
            String s = scanner.next();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }

            System.out.println(Math.max(0, (Math.min(count0, count1)) - 1));

        }
        scanner.close();
    }
}
