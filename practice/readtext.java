import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readtext {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(new File("test,txt"));  
       ) 
       {
        ArrayList<String> brand = new ArrayList<>();
        ArrayList<Double> horse = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();
            while (scan.hasNext()) {
                String line = scan.nextLine(); 
                Scanner findline = new Scanner(line).useDelimiter(",");
                if (findline.hasNext()) { 
                    brand.add(findline.next());
                } if (findline.hasNext()) {
                    horse.add(Double.parseDouble(findline.next()));
                } if (findline.hasNext()) {
                    price.add(Integer.parseInt(findline.next()));
                }
                
                
            }
            for (int i = 0; i<3; i++) {
                if(price.get(i) >100) 
                System.out.println("nice");
                else System.out.println("not ok");
            }
            
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}