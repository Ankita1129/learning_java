// Java program of above implementation
public class max_min_function {
    /* Class Pair is used to return two values from getMinMax() */
    static class MinMax {
        int min;
        int max;
    }

    /* Defining function */
    static MinMax fxnMinMax(int arr[], int n) {
        MinMax ans = new MinMax();
        int temp;

        /* If array contains only one element */

        if (n == 1) {
            ans.max = ans.min = arr[0];
        }

        /* If array contains more than one element */

        else {
            ans.min = arr[0];
            ans.max = arr[n - 1];
            for (int j = 0; j < n; j++) {
                if (ans.min > arr[j]) {
                    temp = ans.min;
                    ans.min = arr[j];
                    if (ans.max < temp) {
                        ans.max = temp;
                    }
                }
                if (ans.max < arr[j]) {
                    ans.max = arr[j];
                }
            }
        }
        return ans;
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = { 4, 2, 8, 1, 3 };
        int n = 5;
        MinMax ans = fxnMinMax(arr, n);
        System.out.printf("\nMinimum element is %d", ans.min);
        System.out.printf("\nMaximum element is %d", ans.max);

    }

}
