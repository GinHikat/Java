import java.util.ArrayList;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please input your array:");
        while(true) {
            int value = Integer.valueOf(scan.nextLine());
            if (value == 0) break;
            else {
                list.add(value);
            }
        } 
        for (int i = list.size() -1; i>= 0; i--) {
            System.out.printf(list.get(i) + " ");
        }
    }
 
}