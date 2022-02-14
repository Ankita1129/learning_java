import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class union_hashmap {
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

        Set<Integer> set1 = new HashSet<>();
        for (int element : arr1) {
            set1.add(element);
        }
        for (int element : arr2) {
            set1.add(element);
        }

        System.out.println(set1.size());
        System.out.println(set1);
        scanner.close();
    }
}
