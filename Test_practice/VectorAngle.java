import java.util.ArrayList;
import java.util.Scanner;
public class VectorAngle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list_x = new ArrayList<>();
        ArrayList<Integer> list_y = new ArrayList<>();
        System.out.printf("Please input how many dimensions you want: ");
        int dim = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i< dim; i++) {
            System.out.printf("x" + (i+1) + " = ");
            int value = Integer.valueOf(scan.nextLine());
            list_x.add(value);
        }
        for (int i = 0; i< dim; i++) {
            System.out.printf("y" + (i+1) + " = ");
            int value = Integer.valueOf(scan.nextLine());
            list_y.add(value);
        }
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for ( int i = 0; i<dim; i++) {
            sum += (list_x.get(i) * list_y.get(i));
            sum1 += list_x.get(i)*list_x.get(i);
            sum2 += list_y.get(i)*list_y.get(i);
        }
        double fin = (double) (sum/ (Math.sqrt(sum1) * Math.sqrt(sum2)));
        double result = Math.toDegrees(Math.acos(fin));
        System.out.println("The angle between 2 vectors is "+ result);
    }
}