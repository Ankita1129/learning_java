import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class distinct_ele_hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> nums = new HashSet<>();
        for (int element : arr) {
            nums.add(element);
        }

        System.out.println(nums);
        scanner.close();
    }
}
