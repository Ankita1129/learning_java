import java.util.Scanner;

class complex_op {
    float real, imag;

    complex_op() { // default constructor
        real = 0;
        imag = 0;
    }

    complex_op(float comp1, float comp2) { // parameterized constructor
        real = comp1;
        imag = comp2;
    }

    void add(complex_op c1, complex_op c2) { // Addition operation
        real = (c1.real) + (c2.real);
        imag = (c1.imag) + (c2.imag);
        System.out.println("Addition: " + real + "+" + imag + "i");
    }

    void subtract(complex_op c1, complex_op c2) { // subtraction operation
        real = (c1.real - c2.real);
        imag = (c1.imag - c2.imag);
        System.out.println("Subtraction is(" + real + ")+(" + imag + ")i");
    }

    void multiply(complex_op c1, complex_op c2) { // multiplication operation
        real = ((c1.real * c2.real) - (c1.imag * c2.imag));
        imag = ((c1.real * c2.imag) + (c2.real * c1.imag));
        System.out.println("Multiplication is(" + real + ")+(" + imag + ")i");
    }

    void divide(complex_op c1, complex_op c2) { // division operation
        if (c2.real == 0 & c2.imag == 0)
            System.out.println("Invalid Result!!! Dividing by zero is undefined");
        else {
            real = (((c1.real * c2.real) + (c1.imag * c2.imag)) / ((c2.real * c2.real) + (c2.imag * c2.imag)));
            imag = (((c1.real * c1.imag) - (c2.real * c2.imag)) / ((c2.real
                    * c2.real) + (c2.imag * c2.imag)));
            System.out.println("Division is(" + real + ")+(" + imag + ")i");
        }
    }
}

class complex {

    public static void main(String args[]) {
        float real1, real2, imag1, imag2;
        int i = 0;
        complex_op cal1 = new complex_op();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of 1st number: "); // input 1st number
        real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of 1st number: ");
        imag1 = sc.nextInt();
        complex_op obj1 = new complex_op(real1, imag1);

        System.out.println("Enter the real part of 2nd number: "); // input 2nd number
        real2 = sc.nextInt();
        System.out.println("Enter the imaginary part of 2nd number: ");
        imag2 = sc.nextInt();
        complex_op obj2 = new complex_op(real2, imag2);

        do {
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Change input.\n6.Exit");
            System.out.println("Enter your choice:");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    cal1.add(obj1, obj2);
                    break;
                case 2:
                    cal1.subtract(obj1, obj2);
                    break;
                case 3:
                    cal1.multiply(obj1, obj2);
                    break;
                case 4:
                    cal1.divide(obj1, obj2);
                    break;
                case 5:
                    main(args);
                    break;
                default:
                    break;
            }
        } while (i < 6);
        if (i > 6) {
            System.out.println("Invalid number chosen.");
        }
    }
}
