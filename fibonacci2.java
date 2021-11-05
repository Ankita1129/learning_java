import java.util.Scanner;

//printing nth term in fibonacci series

public class fibonacci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int tempb = b; // taking tempb to save value of b everytime
            b = b + a;
            a = tempb;
            count++;
        }
        System.out.println(b);
        input.close();
    }
}