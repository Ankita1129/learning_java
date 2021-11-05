import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers

public class sum_of_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers and enter 0 to get the sum: ");
        float sum = 0;
        while (true) {
            float n = input.nextFloat();
            if (n == 0) {
                break;
            }
            sum = sum + n;
        }
        System.out.println(sum);
        input.close();
    }
}
