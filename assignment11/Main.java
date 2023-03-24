package assignment11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c, amt = 0;// declaration of c, amt
        Order order;// reference of order assign to order obj
        Scanner sc = new Scanner(System.in);// creating object of scanner class
        while (true) {// while loop for menu driven
            System.out.println();
            // menu bar
            System.out.println("**** SHOPING CART ****");
            System.out.print("1.Credit Card \n2.PayPal \n3.BitCoin\n4.Exit");
            System.out.print("\n\nEnter the Choice ::");
            c = sc.nextInt();// taking input from user
            System.out.println("------------------------------------------------------");
            if (c == 1 || c == 2 || c == 3) {// check whether 0<c<4
                System.out.print("\nEnter amount to be Tranfer :: ");
                amt = sc.nextInt();// taking amt as input from user
                System.out.println("-------------------------------------------------");
            }
            // switch case
            switch (c) {
                case 1:// for input c ==1
                    order = new Order(amt, new CreditCard());// creating obj of order class
                    order.process();// calling process method of order class
                    break;
                case 2:// for input c == 2
                    order = new Order(amt, new PayPal());// creating obj of order class
                    order.process();// calling process method of order class
                    break;
                case 3:// for input c == 3
                    order = new Order(amt, new BitCoin());// creating obj of order class
                    order.process();// calling process method of order class
                    break;
                case 4:
                    System.out.println("\nThank you For Shopping !!!!");// printing on console
                    System.out.println("---------------------------------------------------------");
                    return;// stop execution of program
                default:
                    System.out.println("Invalid Payment Mode !!!");// default
                    System.out.println("----------------------------------------------------------");
            }
        }
    }
}
