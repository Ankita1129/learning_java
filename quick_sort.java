import java.util.Scanner;

// Quick sort when last element is taken as pivot

public class quick_sort {

    public static void quickSort(int arr[], int low, int high) {
        if (low > high) {
            return;
        }

        int pivot = arr[high];
        int pi_idx = partioning(arr, pivot, low, high);

        quickSort(arr, low, pi_idx - 1); // RECURSION
        quickSort(arr, pi_idx + 1, high); // RECURSION
    }

    public static int partioning(int arr[], int pivot, int low, int high) {
        int i = low, j = low;
        while (i <= high) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

        // returning index at which pivot is located
        return (j - 1);
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
    }

    public static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int high = arr.length - 1;
        int low = 0;
        quickSort(arr, low, high);
        print(arr);
        scanner.close();
    }
}
