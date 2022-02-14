import java.util.Scanner;

//Reverse the given string of aplhabets.

public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans = ""; //
        char ch;
        int N = str.length();
        for (int i = 0; i < N; i++) {
            ch = str.charAt(i);
            ans = ch + ans;
        }

        System.out.println(ans);
        scanner.close();
    }
}
