import java.util.Scanner;

public class chef_and_pal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int count = 0;
        while (count < T) {
            int N = scanner.nextInt();
            if (N % 2 != 0) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < (N / 2); i++) {
                    System.out.print("01");
                }
                System.out.println(); // in order to go to next line
            }
            count++;
        }
        scanner.close();
    }
}
