import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any 2 numbers: ");
            float n1 = a.nextFloat();
            // Scanner b = new Scanner(System.in); ~~~no need to "SCANNER" every single time
            float n2 = a.nextFloat();

            // ~~~~~~~~~~~~~~~~TYPE 'X' TO EXIT~~~~~~~~~~~~~~~~~~ //

            System.out.println("Choose an operation: +,-,*,/ or type x to exit");
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
            } else if (input == 'x' || input == 'X') {
                break; // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~INTERESTING!!!!!
            } else {
                System.out.println("Invalid operator!!!");
            }
        }
        a.close();
        // b.close();
        // in.close();
    }

}

/*
 * char input = a.next().charAt(0);
 */