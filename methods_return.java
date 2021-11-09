import java.util.Scanner;

public class methods_return {
    public static void main(String[] args) {
        int answer = sum2();
        System.out.println(answer);
    }

    // return the value type

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        in.close();
        return sum;
        // After the return statement nothing will be executed no matter what you write
    }
}
