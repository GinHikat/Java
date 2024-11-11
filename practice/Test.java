import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("How many fans do you need: ");
        int n = scan.nextInt();   
        scan.nextLine();
        System.out.println("How many air conditioner you need: ");
        int m = scan.nextInt();   
        scan.nextLine();
        Fan[] f = new Fan[n+1];
        AirConditioner[] ac = new AirConditioner[m+1];
        System.out.println("Input informations for fan");
        for (int i = 0; i<m; i++) {
            System.out.printf("Brand: ");
            String brand = String.valueOf(scan.nextLine());   
            System.out.printf("Speed: ");
            int speed = Integer.valueOf(scan.nextLine());  
            System.out.printf("Power: ");
            int power = Integer.valueOf(scan.nextLine());  
            ac[i] = new AirConditioner(power, brand);
        }
        System.out.println("Input information for air conditioner: ");
        for ( int i = 0; i<n; i++) {
            System.out.printf("Brand: ");
            String brand = String.valueOf(scan.nextLine());   
            System.out.printf("Speed: ");
            int speed = Integer.valueOf(scan.nextLine());  
            System.out.printf("Power: ");
            int power = Integer.valueOf(scan.nextLine());  
            f[i] = new Fan(speed,power, brand);
        }
        for (int i = 0; i<n; i++) {
            f[i].display();
            f[i].swing();
            f[i].cool();
        }
        for (int i = 0; i<m;i++) {
            ac[i].display();
            ac[i].turnOn();
            ac[i].dry();
            ac[i].fanOnly();
            ac[i].cool();
        }
    }
}