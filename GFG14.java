import java.util.Scanner;

//

public class GFG14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
        }
        if (sum % 2 == 0) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
        scanner.close();
    }
}
