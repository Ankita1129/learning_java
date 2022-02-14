import java.util.Scanner;

/*Given a array and a key, count the number of occurrences of given key in the array.*/

public class occurence_in_array {
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
