import java.util.Scanner;

public class largest_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any 2 numbers: ");
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();

        if (n1 < n2) {
            System.out.println(n2 + " is the larger number");
        } else if (n1 > n2) {
            System.out.println(n1 + " is the larger number");
        } else {
            System.out.println("Both are equal.");
        }
        input.close();
    }
}
