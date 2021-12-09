import java.util.Scanner;

// Find the missing number from [1,N] in the array with N-1 elements

public class GFG10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N - 1; i++) {
            array[i] = scanner.nextInt();
        }
        int sum1 = (N * (N + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < N - 1; i++) {
            sum2 = sum2 + array[i];
        }
        int ans = sum1 - sum2;
        System.out.println(ans);
        scanner.close();
    }
}
