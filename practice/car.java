import java.io.*;
import java.util.Scanner;
public class car {

    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in); FileWriter write = new FileWriter("test,txt")) {

            System.out.printf("How many cars do you need: ");
            int n = scan.nextInt();
            scan.nextLine();
            //write.write(String.format("%-20s%-15s%-10s%n", "Brand", "Horsepower", "Price" ));
            //write.write(String.format("%-20s%-15s%-10s%n", "------","-----------", "-----"));
            for (int i = 0; i<n; i++) {
                System.out.println("Brand " + (i+1) +": ");
                String brand = String.valueOf(scan.nextLine());
                System.out.println("Horsepower " + (i+1) +": ");
                double horse = Double.valueOf(scan.nextLine());
                System.out.println("Price " + (i+1) +": ");
                int price = Integer.valueOf(scan.nextLine());
                //write.write(String.format("%-20s%-15s%-10s%n", brand, horse, price));
                write.write(brand +","+horse+","+price+"\n");
            }
            System.out.println("Successfully loaded into text!!");
        }
        catch(IOException e) {
            System.out.println("System error " + e.getMessage());
        }

    }
}