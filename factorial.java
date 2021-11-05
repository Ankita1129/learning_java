import java.util.Scanner;

//Factorial Program In Java

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        long n = input.nextLong();
        long product = 1;
        for (long i = 1; i <= n; i++) {
            product = i * product;
        }
        System.out.println(product);
        input.close();
    }
}
