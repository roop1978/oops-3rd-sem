import java.util.Scanner;

class Employee {
    String employeeName;
    String city;
    double basicSalary;
    double daPercentage;
    double hraPercentage;

    // Constructor to initialize data members
    public Employee() {
        employeeName = "";
        city = "";
        basicSalary = 0.0;
        daPercentage = 0.0;
        hraPercentage = 0.0;
    }

    // Method to get input from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter City: ");
        city = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = scanner.nextDouble();

        System.out.print("Enter DA Percentage: ");
        daPercentage = scanner.nextDouble();

        System.out.print("Enter HRA Percentage: ");
        hraPercentage = scanner.nextDouble();
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return basicSalary + (basicSalary * daPercentage / 100) + (basicSalary * hraPercentage / 100);
    }

    // Method to display employee details and total salary
    public void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("City: " + city);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA Percentage: " + daPercentage);
        System.out.println("HRA Percentage: " + hraPercentage);

        double totalSalary = calculateTotalSalary();
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Employees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].getData();
        }

        System.out.println("\nEmployee Details and Total Salaries:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i].display();
        }
    }
}
