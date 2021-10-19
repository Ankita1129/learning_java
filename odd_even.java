import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Given input is an even number.");
        } else {
            System.out.println("Given input is an odd number.");
        }
        input.close();
    }
}
