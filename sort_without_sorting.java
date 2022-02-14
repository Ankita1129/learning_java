import java.util.Scanner;

//Sort the given array without using any sorting algo if the elements can only be {0,1,2}

public class sort_without_sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count0 = 0, count1 = 0, count2 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] == 2) {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        for (int i = count0; i < (count0 + count1); i++) {
            arr[i] = 1;
        }

        for (int i = (count0 + count1); i < (count0 + count1 + count2); i++) {
            arr[i] = 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        scanner.close();
    }
}
