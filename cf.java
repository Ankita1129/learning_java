import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((long) (24 * Math.pow(4, n - 3) + (n - 3) * 36 * Math.pow(4, n - 4)));
    }

}