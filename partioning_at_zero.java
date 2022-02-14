public class partioning_at_zero {

    public static void partioning(int arr[], int n) {
        int i = 0, j = 0;
        // int temp=0;
        while (i < n) {
            if (arr[i] < 0) {
                if (i != j) {
                    swap(arr, i, j);
                }
                j++;
            }
            i++;
        }
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
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        partioning(arr, n);
        print(arr);
    }
}
