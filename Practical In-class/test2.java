import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void input_name(int value) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
         System.out.println("Input name: ");
        while (true) {
           
            String name = String.valueOf(scan.nextLine());
            if(name.equals("")) {  
                break;
            } else {
                list.add(name);
            } 
        } 
        System.out.println("The names you ask for: ");
        for (int i = 0; i< value; i++) {
            System.out.printf(list.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.printf("Please input how many names you want: "); 
        int n = Integer.valueOf(scan2.nextLine()); /*Return how many names as the user wants */
        input_name(n);
    }
   
}
