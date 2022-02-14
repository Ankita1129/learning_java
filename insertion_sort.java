import java.util.Scanner;

public class insertion_sort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (isSmaller(arr[j + 1], arr[j])) {
                    swap(arr, j + 1, j);
                }
            }
        }
        return arr;
    }

    public static boolean isSmaller(int a, int b) {
        boolean ans = false;
        if (a < b) {
            ans = true;
        }
        return ans;
    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans[] = insertionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        scanner.close();
    }
}
