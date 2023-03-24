import java.util.Scanner;

public class merge_sort {

    // int[] count;

    static int[] sort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] a = new int[1];
            a[0] = arr[lo];
            // System.out.println("a:");
            // System.out.print(a[0] + " ");
            // System.out.println();
            return a;
        }
        int mid = lo + (hi - lo) / 2;
        int[] fsh = sort(arr, lo, mid);
        // System.out.println("fsh:");
        // for (int i = 0; i < fsh.length; i++) {
        // System.out.print(fsh[i] + " ");
        // }
        // System.out.println();
        int[] ssh = sort(arr, mid + 1, hi);
        // System.out.println("ssh:");
        // for (int i = 0; i < ssh.length; i++) {
        // System.out.print(ssh[i] + " ");
        // }
        // System.out.println();
        int[] res = ms(fsh, ssh);
        // System.out.println("res:");
        // for (int i = 0; i < res.length; i++) {
        // System.out.print(res[i] + " ");
        // }
        // System.out.println();
        return res;
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
        ans = sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
