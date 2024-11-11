import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the number

        try (FileWriter writer = new FileWriter("employees.txt")) {
            // Write a header with a formatted string
            writer.write(String.format("%-20s%-10s%-15s%n", "Name", "Age", "Salary"));
            writer.write(String.format("%-20s%-10s%-15s%n", "-------------------", "----", "-------------"));
            
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter details for Employee " + i + ":");
                
                // Collecting employee details
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Extra salary: ");
                double extra = scanner.nextDouble();
                scanner.nextLine();
                
                // Write the collected details with formatted columns
                writer.write(String.format("%-20s%-10d%-15.2f%n", name, age, salary + (extra * 0.25)));
            }
            
            System.out.println("Employee information successfully written to employees.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
