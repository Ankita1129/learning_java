import java.util.Arrays;
import java.util.Scanner;

public class leet {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]); // ! first ke liye ascending
        // Arrays.sort(pairs, (a, b) -> a[1] - b[1]); // ! second ke liye ascending
        // Arrays.sort(pairs, (a, b) -> a[0] - b[1]); // ! first ke liye ascending
        // Arrays.sort(pairs, (a, b) -> a[1] - b[0]); // ! first ke liye descending

        // Arrays.sort(pairs, (a, b) -> b[0] - a[0]); // ! first ke liye descending
        // Arrays.sort(pairs, (a, b) -> b[1] - a[1]); // ! second ke liye descending
        // Arrays.sort(pairs, (a, b) -> b[0] - a[1]); // ! first ke liye ascending
        // Arrays.sort(pairs, (b, a) -> b[1] - a[0]); // ! first ke liye descending

        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i][0] + "    " + pairs[i][1]);
        }
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] pairs = new int[m][2];
        for (int i = 0; i < m; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        findLongestChain(pairs);
        sc.close();
    }
}
