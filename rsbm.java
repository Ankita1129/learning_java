import java.util.Scanner;

// rsbm-----> Rightmost Set Bit Mask

public class rsbm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rsbm = n & -n;
        System.out.println(Integer.toBinaryString(rsbm));
        System.out.println(0 | 1); // OR
        System.out.println(0 & 1); // AND
        System.out.println(2 ^ 5); // XOR
        scanner.close();
    }
}
