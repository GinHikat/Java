import java.util.ArrayList;
import java.util.Scanner;

public class GymnastJudge{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Input points");
        for(int i = 0; i< 6; i++) {
            int value = Integer.valueOf(scan.nextLine());
            list.add(value);
        }
        int max = list.get(0);
        int min = list.get(0);
        double sum = 0.0;
        for (int i = 0; i<6; i++) {
            if(list.get(i) > max) max = list.get(i);
            if (list.get(i) < min) min = list.get(i);
        }
        list.remove(Integer.valueOf(max));
        list.remove(Integer.valueOf(min));
        System.out.println("List after input: ");
        for (int i = 0; i<4; i++){
            sum += list.get(i);
            System.out.print(list.get(i)+ " ");
        }
        System.out.println("\nThe average left: " + (double)(sum/4));


    }
}