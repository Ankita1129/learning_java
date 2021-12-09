import java.util.Scanner;

//Given a series 9, 33, 73, 129...  Find the n-th term of the series.

public class GFG2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        ans = ((8 * n * n) + 1);
        System.out.print("Answer: " + ans);
        scanner.close();
    }
}
