import java.util.Scanner;

//Multiplication of array elements for various test cases

public class test_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int count1 = 0;
        int N;
        while (count1 < test) {
            N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            count1++;
            int ans = 1;
            for (int j = 0; j < N; j++) {
                ans = ans * array[j];
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
