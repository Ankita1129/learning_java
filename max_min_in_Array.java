import java.util.Scanner;

public class max_min_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // scanner.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max, min, temp;
        if (n == 1) {
            max = min = arr[0];
        } else {
            min = arr[0];
            max = arr[n - 1];
            for (int j = 0; j < n; j++) {
                if (min > arr[j]) {
                    temp = min;
                    min = arr[j];
                    if (max < temp) {
                        max = temp;
                    }
                }
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
        }
        System.out.println(min + "    " + max);
        scanner.close();
    }
}
