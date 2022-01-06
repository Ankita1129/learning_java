import java.util.Scanner;

public class StonesOnTheTable266A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String S = scanner.next();
        char prev = S.charAt(0);
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == prev) {
                count++;
            } else {
                prev = S.charAt(i);
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
