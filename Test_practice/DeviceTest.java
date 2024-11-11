import java.util.Scanner;
public class DeviceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input how many Air conditioner and Fans you want: ");
        int air = Integer.valueOf(scan.nextLine());
        int fan = Integer.valueOf(scan.nextLine());
        Fan[] f = new Fan[fan+1];
        for (int i = 0; i< fan; i++) {
            System.out.printf("Fan " + (i+1) + " Speed: ");
            int speed = Integer.valueOf(scan.nextLine());
            System.out.printf("Fan " + (i+1) +" Power: ");
            int power = Integer.valueOf(scan.nextLine());
            System.out.printf("Fan " + (i+1) +" Brand: ");
            String brand = String.valueOf(scan.nextLine());
            f[i] = new Fan(speed, power, brand);
        }
        AirConditioner[] ac = new AirConditioner[air + 1];
        for (int i = 0; i<air; i++) {
            System.out.printf("Air conditioner " + (i+1) +" Power: ");
            int power = Integer.valueOf(scan.nextLine());
            System.out.printf("Air conditioner " + (i+1) +" Brand: ");
            String brand = String.valueOf(scan.nextLine());
            ac[i] = new AirConditioner(power, brand);
        }
        for (int i = 0; i<fan; i++) {
            f[i].display();
            f[i].swing();
            f[i].cool();
        }
        for (int i = 0; i<air; i++) {
            ac[i].display();
            ac[i].cool();
        }
    } 
}
