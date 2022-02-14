import java.util.Scanner;

// max_until_here=k
// max_so_far=p

public class kadanes_algo {
    public static int kadanesAlgo(int[] arr, int max_so_far, int max_until_here) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > (max_until_here + arr[i])) {
                max_until_here = arr[i];
            } else {
                max_until_here = max_until_here + arr[i];
            }
            if (max_so_far < max_until_here) {
                max_so_far = max_until_here;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max_so_far = 0;
        int max_until_here = 0;
        int ans = kadanesAlgo(arr, max_so_far, max_until_here);
        System.out.println(ans);

        scanner.close();
    }
}
