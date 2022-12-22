import java.util.Scanner;

class complexop {
    float real, imaginary;

    // ! Default constructor
    complexop() {
        real = 0;
        imaginary = 0;
    }

    // ! Paramaterized constructor.
    complexop(float r, float i) {
        real = r;
        imaginary = i;

    }

    // ! Taking input of complex numbers.
    void extract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part:");
        this.real = sc.nextInt();
        System.out.println("Enter the imaginary part:");
        this.imaginary = sc.nextInt();
    }

    // ! Displaying the complex numbers.
    void display() {
        if (imaginary == 0)
            System.out.println("The Complex number is: " + this.real);
        else if (real == 0)
            System.out.println("The Complex number is: " + this.imaginary + "i");
        else if (imaginary < 0)
            System.out.println("The Complex number is: " + this.real + "-" + this.imaginary + "i");
        else
            System.out.println("The Complex number is: " + this.real + "+" + this.imaginary + "i");
    }

    // ! Addition of complex numbers.
    void sum(complexop c1, complexop c2) {
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;
        System.out.println("Addition is: " + this.real + " + " + this.imaginary + "i");
    }

    // ! Subtraction of complex numbers
    void subtract(complexop c1, complexop c2) {
        this.real = c1.real - c2.real;
        this.imaginary = c1.imaginary - c2.imaginary;
        System.out.println("Subtraction is: " + this.real + " + " + this.imaginary + "i");
    }

    // ! Multiplication of complex numbers.
    void multiply(complexop c1, complexop c2) {
        this.real = c1.real * c2.real;
        this.imaginary = c1.imaginary * c2.imaginary;
        System.out.println("Multiplication is: " + this.real + " + " + this.imaginary + "i");
    }

    // ! Division of complex numbers.
    void divide(complexop c1, complexop c2) {
        this.real = (c1.real * c2.real + c1.imaginary * c2.imaginary)
                / (c1.real * c1.real + c2.imaginary * c2.imaginary);
        this.imaginary = (c1.imaginary * c2.real - c1.real * c2.imaginary)
                / (c2.real * c2.real + c2.imaginary * c2.imaginary);
        System.out.println("Division is: " + this.real + " + " + this.imaginary + "i");
    }
}

class complex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float r, i;
        System.out.println("Enter the real part:");
        r = sc.nextInt();
        System.out.println("Enter the imaginary part:");
        i = sc.nextInt();
        complexop c1 = new complexop(r, i);
        c1.display();
        complexop c2 = new complexop();
        c2.extract();
        c2.display();
        complexop c3 = new complexop();

        System.out.println("Arithmetic operation on complex number");
        System.out.println("1.addition");
        System.out.println("2.sub");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.change the input");
        System.out.println("6.Exit");
        int num;

        do {
            System.out.println("enter your choice");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    c1.display();
                    c2.display();
                    c3.sum(c1, c2);
                    break;
                case 2:
                    c1.display();
                    c2.display();
                    c3.subtract(c1, c2);
                    break;
                case 3:
                    c1.display();
                    c2.display();
                    c3.multiply(c1, c2);
                    break;
                case 4:
                    c1.display();
                    c2.display();
                    c3.divide(c1, c2);
                    break;
                case 5:
                    c1.extract();
                    c1.display();
                    c2.extract();
                    c2.display();
                default:
                    System.out.println("Invalid choice no");
                    break;
            }
        } while (num < 6);
    }
}