import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        if (N >= 3) {
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < N - i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr)); // converting array to string
            scanner.close();
        }
    }
}
