import java.util.Scanner;

public class str_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int i = 0, j = str.length() - 1;
        while (j >= i) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("IT IS NOT A PALINDROME!!!");
                break;
            } else {
                i++;
                j--;
                if (i >= j) {
                    System.out.println("IT IS A PALINDROME!!!");
                    break;
                }
            }
        }
        input.close();
    }
}
