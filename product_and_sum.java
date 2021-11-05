import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer

public class product_and_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        int product = 1;
        int temp1 = num;
        while (temp1 > 0) {
            int rem1 = temp1 % 10;
            product = product * rem1;
            temp1 = temp1 / 10;
        }

        int sum = 0;
        int temp2 = num;
        while (temp2 > 0) {
            int rem2 = temp2 % 10;
            sum = sum + rem2;
            temp2 = temp2 / 10;
        }
        int ans = product - sum;
        System.out.println(ans);
        input.close();
    }
}
