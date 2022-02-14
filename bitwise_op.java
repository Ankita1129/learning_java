import java.util.Arrays;
import java.util.Scanner;

public class bitwise_op {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();

        // to get an element on-----> OR
        int onmask[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != (a - 1)) {
                onmask[i] = 0;
            } else {
                onmask[i] = 1;
            }
        }
        int on[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (onmask[i] == 0 && arr[i] == 0) {
                on[i] = 0;
            } else {
                on[i] = 1;
            }
        }
        System.out.print("OR: ");
        for (int i = 0; i < n; i++) {
            System.out.print(on[i] + " ");
        }
        System.out.println();

        // to get an element off-----> AND
        int offmask[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != (a - 1)) {
                offmask[i] = 1;
            } else {
                offmask[i] = 0;
            }
        }
        int off[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (offmask[i] == 1 && arr[i] == 1) {
                off[i] = 1;
            } else {
                off[i] = 0;
            }
        }
        System.out.print("AND: ");
        for (int i = 0; i < n; i++) {
            System.out.print(off[i] + " ");
        }
        System.out.println();

        // to toggle an element-----> XOR
        int xormask[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != (a - 1)) {
                xormask[i] = 0;
            } else {
                xormask[i] = 1;
            }
        }
        int xor[] = new int[n];
        for (int i = 0; i < n; i++) {
            if ((xormask[i] == 0 && arr[i] == 0) || (xormask[i] == 1 && arr[i] == 1)) {
                xor[i] = 0;
            } else {
                xor[i] = 1;
            }
        }
        System.out.print("XOR: ");
        for (int i = 0; i < n; i++) {
            System.out.print(xor[i] + " ");
        }
        System.out.println();

        // to check on/off-----> AND
        int checkmask[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != (a - 1)) {
                checkmask[i] = 0;
            } else {
                checkmask[i] = 1;
            }
        }
        int check[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (checkmask[i] == 1 && arr[i] == 1) {
                check[i] = 1;
            } else {
                check[i] = 0;
            }
        }
        System.out.print("Check ON/OFF: ");
        Arrays.sort(check);
        if (check[0] == check[n - 1]) {
            System.out.println("OFF");
        } else {
            System.out.println("ON");
        }

        scanner.close();
    }
}
