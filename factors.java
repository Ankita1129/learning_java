import java.util.Scanner;

//Input a number and print all the factors of that number 

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
