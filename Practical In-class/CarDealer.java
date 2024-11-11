import java.io.*;
import java.util.Scanner;

public class CarDealer
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in); FileWriter writer = new FileWriter("car.txt"))
        {
            writer.write("Brand, Name, Hourse Power, Price \n");
            writer.write("-------------------------------- \n");

            System.out.println("Enter the number of car: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Details of cars: ");
            for(int i = 1; i <= n; i++)
            {
                System.out.println("\nCar "+i+": ");

                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter horsepower: ");
                int horsepower = scanner.nextInt();
                
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                writer.write(brand + ","+ name + ","+ horsepower + "," + price + "\n");   
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e.getMessage());
        }        
    }
}