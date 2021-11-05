import java.util.Scanner;

//To find whether the input char is of upper or lower case

public class alphabet_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
        input.close();
    }
}
/*
 * trim() is used to remove the space given by the user before actual input
 * __________a ~~~~~~~~~~~~~ these (__________) spaces are removed by trim()
 */
