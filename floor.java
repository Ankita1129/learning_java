import java.util.Scanner;

//Sum of product of x and y with floor(n/x) = y 

public class floor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int y = 0, a = 0, sum = 0;
        for (int x = 1; x <= n; x++) {
            y = (int) (n / x);
            a = x * y;
            sum = sum + a;
        }
        System.out.print("Answer: " + sum);
        input.close();
    }
}
