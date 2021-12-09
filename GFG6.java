import java.util.Scanner;

/*Given an integer N which has odd number of digits, find whether the given number is a balanced or not.
An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.*/

public class GFG6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        char arr[] = N.toCharArray();
        int len = arr.length;
        int mid = (int) (len / 2);
        int sum1 = 0;
        for (int i = 0; i < mid; i++) {
            sum1 = sum1 + arr[i];
        }
        int sum2 = 0;
        for (int j = len - 1; j > mid; j--) {
            sum2 = sum2 + arr[j];
        }
        if (sum1 == sum2) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
        scanner.close();
    }
}
