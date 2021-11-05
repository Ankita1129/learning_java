import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First method
        int num1 = input.nextInt();

        while (num1 != 0) {
            int b = num1 % 10;
            System.out.print(b);
            num1 = num1 / 10;
        }

        // Second method
        int num2 = input.nextInt();
        int ans = 0;
        while (num2 > 0) {
            int rem = num2 % 10;
            ans = ans * 10 + rem;
            num2 = num2 / 10;
        }
        System.out.println(num2);
        input.close();
    }
}
