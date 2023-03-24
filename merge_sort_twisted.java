import java.util.Scanner;

public class merge_sort_twisted {

    int[] count;

    static void sort(int[] arr, int lo, int hi) {
        if (lo <= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid + 1, hi);
        // ms(fsh, ssh);
        // return res;
    }

    static int[] ms(int[] l, int[] r) {
        int[] sarr = new int[l.length + r.length];
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                sarr[k] = l[i];
                i++;
            } else {
                sarr[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l.length) {
            sarr[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            sarr[k] = r[j];
            j++;
            k++;
        }
        System.out.println("sarr:");
        for (int idx = 0; idx < sarr.length; idx++) {
            System.out.print(sarr[idx] + " ");
        }
        System.out.println();
        return sarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        // ans = sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
