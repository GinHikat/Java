import java.util.ArrayList;
import java.util.Scanner;
public class median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.err.println("Please input your array: ");
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            }
            else list.add(value);
        }
        if (list.size() % 2 == 0) {
            System.out.println("The median is " + list.get(list.size()/2));
        } else {
            System.out.println("The median is " + list.get((list.size()/2)+1));
        }

    }
}