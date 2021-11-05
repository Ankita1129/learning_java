import java.util.Scanner;

//printing fibonacci series upto nth term

public class fibonacci1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n = input.nextInt();
        int n1 = 0, n2 = 1, n3, count;
        input.close();
        for (count = 1; count <= n; count++) {
            n3 = n1 + n2;
            System.out.println(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

}
