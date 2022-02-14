import java.util.Arrays;
import java.util.Scanner;

public class shift_and_reverse {

    public static void reverse(int[] ascsorted) {
        int n = ascsorted.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = ascsorted[i];
            ascsorted[i] = ascsorted[n - i - 1];
            ascsorted[n - i - 1] = temp;
        }
    }

    public static void leftRotate(int temp[], int n) {
        int temp1[] = new int[1];
        for (int i = 0; i < 1; i++) {
            temp1[i] = temp[i];
        }
        for (int i = 1; i < n; i++) {
            temp[i - 1] = temp[i];
        }
        for (int i = 0; i < 1; i++) {
            temp[i + n - 1] = temp1[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n < 2) {
            System.out.println("1");
        }

        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        int ascsorted[] = new int[n];
        for (int i = 0; i < n; i++) {
            ascsorted[i] = arr[i];
        }
        Arrays.sort(ascsorted);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ascsorted[i] == arr[i]) {
                count++;
            }
        }
        if (count == n) {
            System.out.println(0);
        } else {
            count = 0;
        }
        reverse(ascsorted);
        int descsorted[] = new int[n];
        for (int i = 0; i < n; i++) {
            descsorted[i] = ascsorted[i];
        }
        reverse(ascsorted);
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (descsorted[i] == arr[i]) {
                count1++;
            }
        }
        if (count1 == n) {
            System.out.println(1);
        } else {
            count1 = 0;
        }

        int ans = 0;
        int ans1 = 0;
        if (count != n && count1 != n) {
            for (int p = 1; p < n; p++) {
                leftRotate(temp, n);
                for (int i = 0; i < n; i++) {
                    if (ascsorted[i] == temp[i]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == n) {
                    ans = (p);
                    break;
                } else {
                    count = 0;
                }
                for (int i = 0; i < n; i++) {
                    if (descsorted[i] == temp[i]) {
                        count1++;
                    } else {
                        break;
                    }
                }
                if (count1 == n) {
                    ans = (p + 1);
                    break;
                } else {
                    count1 = 0;
                }
            }

            reverse(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            count = 0;
            for (int k = 1; k < n; k++) {
                leftRotate(arr, n);

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                for (int i = 0; i < n; i++) {
                    if (ascsorted[i] == arr[i]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == n) {
                    ans1 = (k + 1);
                    break;
                } else {
                    count = 0;
                }
                for (int i = 0; i < n; i++) {
                    if (descsorted[i] == arr[i]) {
                        count1++;
                    } else {
                        break;
                    }
                }
                if (count1 == n) {
                    ans1 = (k + 2);
                    break;
                } else {
                    count1 = 0;
                }
            }

            int answer = Math.min(ans, ans1);
            System.out.println(answer);
        }

        scanner.close();
    }
}
