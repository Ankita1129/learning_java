import java.util.Scanner;

/*Given a singly linked list and a key, count the number of occurrences of given key in the linked list.*/

public class GFG7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        // int element= input.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        int search = input.nextInt();
        int count = 0;
        for (int j = 0; j < N; j++) {
            if (array[j] == search) {
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
