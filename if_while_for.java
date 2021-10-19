public class if_while_for {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("Value of a is 10");
        }

        int count = 1;
        while (count != 3) {
            System.out.println(count);
            count++;
        }

        for (int value = 1; value != 5; value++) {
            System.out.println(value);
        }
    }

}
