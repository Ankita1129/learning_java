import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int X = 0;
        while (temp-- > 0) {
            String s = scanner.next();
            if (s.charAt(1) == '+') {
                X = X + 1;
            } else if (s.charAt(1) == '-') {
                X = X - 1;
            }
        }
        System.out.println(X);
        scanner.close();
    }
}
