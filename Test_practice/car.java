import java.io.*;
import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in); FileWriter file_write = new FileWriter("car,txt")) {

            file_write.write(String.format("%-20s%-15s%-10s%n", "Brand", "Horsepower", "Price"));
            file_write.write(String.format("%-20s%-10s%-15s%n", "-------------------", "----", "-------------"));
           
            System.out.printf("How many horses are there? ");
            int n = scan.nextInt();
            scan.nextLine();
            System.out.println("Please input the information:");
            for (int i = 0; i<n; i++) {
                System.out.println("Input Brand: ");
                String brand = String.valueOf(scan.nextLine());
                System.out.printf("Input Horsepower: ");
                int horse = scan.nextInt();
                scan.nextLine();
                System.out.printf("Input price: ");
                int price = scan.nextInt();
                scan.nextLine();
                file_write.write(String.format("%-20s%-15s%-10s%n", brand, horse, price));
            }
    
        }
        catch(IOException e) {
            System.out.println("System fail" +e.getMessage());
        }
            
    }
}
