import java.io.*;
import java.util.Scanner;
public class score {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in); FileWriter file = new FileWriter("score.txt")) {
            System.out.printf("How many students you want to input: ");
            int n = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i<n; i++) {
                System.out.println("Midterm " + (i+1) +"= ");
                int midterm_score = scan.nextInt();
                scan.nextLine();

                System.out.println("Final " + (i+1) + "= ");
                int final_score = scan.nextInt();
                scan.nextLine();

                file.write(midterm_score + "," +final_score+"\n");
            }
        }
        catch(IOException e) {
            System.out.println("IO error" + e.getMessage());
        }
    }
}