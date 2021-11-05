import java.util.Scanner;

public class armstrong {
    static void findArmstrong(int low, int high) {
        for (int i = low + 1; i < high; i++) {
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10; // ~~~~~~~~~~~~~~ x = x / 10
                n++;
            }
            int sum = 0;
            x = i;
            while (x != 0) {
                int a = x % 10;
                sum += Math.pow(a, n); // ~~~~~~~~~~~~~~ sum = sum + Math.pow(a, n)
                x /= 10; // ~~~~~~~~~~~~~~ x = x / 10
            }
            if (sum == i) {
                System.out.println(i + "");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int num1 = input.nextInt();
        System.out.print("Enter upper limit: ");
        int num2 = input.nextInt();
        findArmstrong(num1, num2);
        System.out.println();
        input.close();
    }
}

/*
 * It's a combination division-plus-assignment operator.
 * 
 * a /= b; means divide a by b and put the result in a.
 * 
 * There are similar operators for addition, subtraction, and multiplication:
 * +=, -= and *=.
 * 
 * %= will do modulus.
 * 
 * >>= and <<= will do bit shifting.
 * 
 * import java.lang.Math; (Math.pow(a, b))
 * 
 * The java.lang.Math.pow() is used to calculate a number raise to the power of
 * some other number. This function accepts two parameters and returns the value
 * of first parameter raised to the second parameter. There are some special
 * cases as listed below:
 * 
 * If the second parameter is positive or negative zero then the result will be
 * 1.0. If the second parameter is 1.0 then the result will be same as that of
 * the first parameter. If the second parameter is NaN then the result will also
 * be NaN
 */