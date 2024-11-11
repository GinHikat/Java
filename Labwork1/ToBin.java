import java.util.Scanner;
public class ToBin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";
        int n = Integer.valueOf(scan.nextLine());
        while (n > 0) {
            s += (n%2);
            n /= 2;
        }
        System.out.println(s);
    }
}
