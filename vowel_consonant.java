import java.util.Scanner;

//Java Program Vowel Or Consonant

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char chr = input.next().charAt(0);
        if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
            System.out.println("Vowel!!!");
        } else {
            System.out.println("Consonant!!!");
        }
        input.close();
    }
}
