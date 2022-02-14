import java.util.Scanner;

public class stable_seq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int count = 0;
        int max, min;
        while (count < T) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            max = arr[0];
            min = arr[0];
            for (int i = 1; i < N; i++) {
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            if (max == min) {
                System.out.println(0);
            } else if (max == arr[N - 1]) {
                System.out.println(1);
            } else if (max != arr[N - 1]) {
                System.out.println(2);
            }

            count++;
        }
        scanner.close();

    }
}
