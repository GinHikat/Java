import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class result{
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner (new File("score.txt"))) {
            ArrayList<Integer> midd = new ArrayList<>();
            ArrayList<Integer> fina = new ArrayList<>(); 
            
            while (scan.hasNext()) {
                String line = scan.nextLine();
                Scanner findline = new Scanner(line).useDelimiter(",");
                if(findline.hasNext()) {
                    midd.add(Integer.parseInt(findline.next()));
                }
                if(findline.hasNext()) {
                    fina.add(Integer.parseInt(findline.next()));
                }
           
            }

            student[] s = new student[midd.size()]; //create new instance of student

            for (int i = 0; i< midd.size(); i++) {
                String result;
                Scanner scanner = new Scanner(System.in);
                System.out.printf("Course ID " + (i+1) +": ");
                String courseid = String.valueOf(scanner.nextLine());
                System.out.printf("Lecturer ID "+ (i+1) +": ");
                String lectid = String.valueOf(scanner.nextLine());
                System.out.printf("Student ID "+ (i+1) +": ");
                String stuid = String.valueOf(scanner.nextLine());
                System.out.printf("Name "+ (i+1) +": ");
                String name = String.valueOf(scanner.nextLine());
                int mid = midd.get(i);
                int fin = fina.get(i);
                if (midd.get(i) >= 7 && fina.get(i) >= 10) {
                    result = "Passed";
                } else result = "Retake";
                s[i] = new student(courseid, lectid, stuid, name, mid, fin, result);
            }
            for (int i = 0; i<midd.size(); i++) {
                s[i].display();
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found" + ex.getMessage());
        }
        catch(NoSuchElementException n) {
            System.out.println("No element");
        }
    }

}