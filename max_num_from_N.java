import java.util.Scanner;

/*Given a number N, write a program to find a maximum number that can be formed using all of the digits of this number.
Note: The given number can be very large, so the input is taken as a String.*/

public class max_num_from_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        char arr[] = N.toCharArray(); // converting String into array
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i]; // Swaping digits
                    arr[i] = arr[j]; // Swaping digits
                    arr[j] = temp; // Swaping digits
                }
            }
        }
        String str = String.copyValueOf(arr); // converting Array back to String
        System.out.println(str);
        scanner.close();
    }
}

/*
 * Since two loops are used here one inside the other, the time complexity here
 * is O(n^2) but if we try we can make it O(n)
 */
