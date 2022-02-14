import java.util.Scanner;

public class range {
    public static boolean prime(int a) {
        if (a <= 1)
            return false;
        else if (a == 2)
            return true;
        else if (a % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 0;
        if (prime(n)) {
            a = n;
            b = n;
        }
        int temp = n;
        temp = temp + 1;
        n = n - 1;

        if (a == 0 && b == 0) {
            while (true) {
                if (prime(temp)) {
                    a = temp;
                    break;
                } else {
                    temp = temp + 1;
                }
            }
            while (true) {
                if (prime(n)) {
                    b = n;
                    break;
                } else {
                    n = n - 1;
                }
            }
        }
        System.out.println(b + " " + a);
        scanner.close();
    }
}
