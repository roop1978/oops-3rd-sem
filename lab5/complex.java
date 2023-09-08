import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    public Complex() {
        real = 0.0;
        imaginary = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(int num) {
        return new Complex(this.real + num, this.imaginary);
    }

    public Complex add(Complex complex) {
        return new Complex(this.real + complex.real, this.imaginary + complex.imaginary);
    }

    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

class Complex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the complex number: ");
        double realPart = scanner.nextDouble();

        System.out.print("Enter the imaginary part of the complex number: ");
        double imaginaryPart = scanner.nextDouble();

        Complex complex1 = new Complex(realPart, imaginaryPart);

        System.out.print("Enter an integer to add to the complex number: ");
        int integerToAdd = scanner.nextInt();

        System.out.print("Enter the real part of another complex number: ");
        realPart = scanner.nextDouble();

        System.out.print("Enter the imaginary part of another complex number: ");
        imaginaryPart = scanner.nextDouble();

        Complex complex2 = new Complex(realPart, imaginaryPart);

        Complex result1 = complex1.add(integerToAdd);
        Complex result2 = complex1.add(complex2);

        System.out.println("\nResult of adding an integer to the complex number:");
        complex1.display();
        System.out.print(" + " + integerToAdd + " = ");
        result1.display();

        System.out.println("\nResult of adding two complex numbers:");
        complex1.display();
        System.out.print(" + ");
        complex2.display();
        System.out.print(" = ");
        result2.display();
    }
}
