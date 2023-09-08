import java.util.Scanner;

class Box {
     double width;
     double height;
     double depth;

    // Constructor to initialize the dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume
    public double calculateVolume() {
        return width * height * depth;
    }
}

 class BoxDemo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the depth of the box: ");
        double depth = scanner.nextDouble();

        // Create a Box object with user-provided dimensions
        Box myBox = new Box(width, height, depth);

        // Calculate and print the volume of the box
        double volume = myBox.calculateVolume();
        System.out.println("Volume of the box is: " + volume);

        // Close the Scanner
        // scanner.close();
    }
}
