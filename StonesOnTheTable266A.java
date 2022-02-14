import java.util.Scanner;

public class StonesOnTheTable266A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String S = scanner.next();
        char previous = S.charAt(0);
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == previous) {
                count++;
            } else {
                previous = S.charAt(i);
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
