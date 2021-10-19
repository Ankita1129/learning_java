import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter any 2 numbers: ");
        Scanner a = new Scanner(System.in);
        float n1 = a.nextFloat();
        // Scanner b = new Scanner(System.in); ~~~no need to "SCANNER" every single time
        float n2 = a.nextFloat();

        System.out.println("Choose an operation: +,-,*,/");
        // Scanner in = new Scanner(System.in);
        char input = a.next().charAt(0);// way to input a char & math signs are taken as char

        if (input == '+') {
            System.out.println("Answer is: " + (n1 + n2));
        } else if (input == '-') {
            System.out.println("Answer is: " + (n1 - n2));
        } else if (input == '*') {
            System.out.println("Answer is: " + (n1 * n2));
        } else if (input == '/') {
            System.out.println("Answer is: " + (n1 / n2));
        } else {
            System.out.println("Your input is incorrect!");
        }
        a.close();
        // b.close();
        // in.close();
    }

}
