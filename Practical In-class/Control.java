import java.util.Scanner;

public class Control
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of fans: ");
        int n = scanner.nextInt();

        System.out.println("Enter the number of ACs: ");
        int m = scanner.nextInt();

        Fan[] f = new Fan[n + 1];
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Fan "+i+" details: ");

            System.out.print("Power: ");
            int power = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Brand: ");
            String brand = scanner.nextLine();

            System.out.print("Speed: ");
            int speed = scanner.nextInt();

            f[i] = new Fan(power, brand, speed);
        }

        AirConditioner[] ac = new AirConditioner[m + 1];
        for(int i = 1; i <= m; i++)
        {
            System.out.println("AC "+i+" details: ");

            System.out.print("Power: ");
            int power = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Brand: ");
            String brand = scanner.nextLine();

            System.out.print("Inverter (true/false): ");
            boolean inverter = scanner.nextBoolean();

            ac[i] = new AirConditioner(power, brand, inverter);
        }

        System.out.println("All devices: ");

        for(int i = 1; i <= n; i++)
        {
            System.out.println(f[i].display());
            f[i].swing();
        }
        for(int i = 1; i <= n; i++)
        {
            System.out.println(ac[i].display());
            ac[i].dry();
        }
    }
}