import java.util.Scanner;

public class counting_sort {
    public static void countSort(int arr[], int min, int max) {
        int range = max - min + 1;

        int fre[] = new int[range];
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            fre[idx]++;
        }

        for (int i = 1; i < fre.length; i++) {
            fre[i] = fre[i] + fre[i - 1];
        }

        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i] - min;
            int idx = fre[value] - 1;
            ans[idx] = arr[i];
            fre[value]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
            System.out.print(arr[i] + " ");
        }

    }

    // public static void print(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr_size = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            arr[i] = scanner.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        countSort(arr, min, max);
        // print(arr);
        scanner.close();
    }
}
