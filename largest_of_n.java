import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.

public class largest_of_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers and enter 0 to get the largest number: ");
        float max = 0;
        while (true) {
            float n = input.nextFloat();
            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
        input.close();
    }
}
