import java.util.Scanner;

public class selection_sort {
    public static int[] selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    temp = j;
                }
            }
            swap(arr, i, temp);
        }
        return arr;
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
        int ans[] = selectionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        scanner.close();
    }
}
