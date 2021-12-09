import java.util.Scanner;

/*Given the value of n, we need to find the sum of the series where i-th term is sum of first i natural numbers.
NOTE: Sum of the series 1 + (1+2) + (1+2+3) + (1+2+3+4) + …… + (1+2+3+4+…+n)*/

public class GFG4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long ans = 0;
        long temp = n;
        for (long i = 1; i <= n; i++) {
            ans = ans + (i * temp);
            temp--;
        }
        System.out.print("Answer: " + ans);
        input.close();
    }
}
