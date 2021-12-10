import java.util.Scanner;

//Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

public class GFG12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt(); // sorted array
        }
        int K = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("-1");
        }
        scanner.close();
    }
}