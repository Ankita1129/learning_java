import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any three numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        // First method
        float max1 = a;
        if (max1 < b) {
            max1 = b;
        }
        if (max1 < c) {
            max1 = c;
        }

        // Second method
        float max2 = Math.max(c, Math.max(a, b));

        System.out.println("Largest number is: " + max1 + max2);
        input.close();
    }
}
