import java.util.HashSet;
import java.util.Scanner;

public class intersection_hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        for (int element : arr1) {
            set1.add(element);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int element : arr2) {
            if (set1.contains(element)) {
                set2.add(element);
            }
        }

        System.out.println(set2.size());
        System.out.println(set2);
        scanner.close();
    }
}
