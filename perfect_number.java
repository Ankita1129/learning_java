import java.util.Scanner;

//Perfect Number In Java

public class perfect_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int a = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i < a) {
            if (a % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == a) {
            System.out.print("It is a PERFECT NUMBER!!!");
        } else {
            System.out.print("It is NOT a perfect number");
        }
        scanner.close();
    }
}
