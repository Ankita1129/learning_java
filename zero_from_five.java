import java.util.Scanner;

// Replace zero from 5 in the given integer

public class zero_from_five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str1 = String.valueOf(n); // converting integer to string
        String str2 = str1.replace('0', '5'); // replacing 0 from 5
        int ans1 = Integer.parseInt(str2); // converting string back to integer

        int ans2 = Integer.parseInt(String.valueOf(n).replace('0', '5')); // Single line solution

        System.out.println(ans1 + "   " + ans2);
        scanner.close();
    }
}
