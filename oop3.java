import java.util.Scanner;

class publication {
    String title;
    int price, copies;

    int sellCopies() {
        System.out.println("Total sale of publication is:" + (copies * price));
        return (copies * price);
    }

    void setCopies(int c) {
        copies = c;
    }

    void setPrice(int p) {
        price = p;
    }
}

class book extends publication {
    String author;
    int book_price, book_copies;

    void orderCopies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of the book:");
        title = sc.next();
        System.out.println("Enter author name:");
        author = sc.next();
        System.out.println("Enter the number of copies of the book:");
        book_copies = sc.nextInt();
        setCopies(copies);
        System.out.println("Enter the price of the book:");
        book_price = sc.nextInt();
        setPrice(price);
    }

    int sellCopies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of copies of the book:");
        book_copies = sc.nextInt();
        setCopies(book_copies);
        System.out.println("Enter the price of the book:");
        book_price = sc.nextInt();
        setPrice(book_price);
        System.out.println("Total sale of the book is: " + (copies * price));
        return (copies * price);
    }
}

class magazine extends publication {
    int quantity, mag_price, mag_copies;
    String curr_issue;

    void receiveIssue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of the Magazine:");
        title = sc.next();
        System.out.println("Enter current issue:");
        curr_issue = sc.next();
        System.out.println("Enter the number of copies of the magazine:");
        copies = sc.nextInt();
        setCopies(copies);
        System.out.println("Enter the price of the magazine:");
        price = sc.nextInt();
        setPrice(price);
    }

    int sellCopies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of copies of the magazine:");
        copies = sc.nextInt();
        setCopies(copies);
        System.out.println("Enter the price of the magazine:");
        price = sc.nextInt();
        setPrice(price);
        System.out.println("Total sale of the magazine is: " + (copies * price));
        return (copies * price);
    }
}

class basic {
    public static void main(String[] args) {
        publication p1;
        p1 = new book();
        publication p2;
        p2 = new magazine();
        System.out.println("Total sale: " + (p1.sellCopies() + p2.sellCopies()));
    }
}