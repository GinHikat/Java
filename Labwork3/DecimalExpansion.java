import java.util.ArrayList;
import java.util.Scanner;

public class DecimalExpansion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int p = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter denominator: ");
        int q = Integer.valueOf(scanner.nextLine());
        int a = p;
        int b = q;
        boolean isNegative = (p <0) || (q<0); //isNegative is set if p or q <0

        p = Math.abs(p);
        q= Math.abs(q);

        int intergerPart = p/q; //take int part for concatenate
        int remainderPart =  p%q; //take quotient part

        StringBuilder result = new StringBuilder();
        if (isNegative && (intergerPart != 0 || remainderPart != 0)) result.append("-"); //add - sign if p or q is negative
        result.append(intergerPart); //start with int part

        if (remainderPart == 0) {
            System.out.println(result); //if no remainder then it's done
        }

        result.append(".");

        // List to store remainders and their positions for cycle detection
        ArrayList<Integer> remainders = new ArrayList<>();
        
        // StringBuilder for the fractional part
        StringBuilder fractionalPart = new StringBuilder();

        while (remainderPart != 0) {
            if (remainders.contains(remainderPart)) {   //check for duplicate of remainder
                int startRemainder = remainders.indexOf(remainderPart); // find where the remainder duplicate is
                fractionalPart.insert(startRemainder, "("); //insert parenthesis before where the remainder duplicate is
                fractionalPart.append(")");
                break;
            }
            remainders.add(remainderPart); //add remainder into the array until it completes the ( )

            remainderPart *= 10; 
            int digit = remainderPart/q; //take the remainder and divide by q to bring the next decimal power
            fractionalPart.append(digit);
            remainderPart %= q; //set the remainder to be the remainder of it by q


        }
        result.append(fractionalPart); //finish the expansion by adding the fractional part

        double calculatorResult = (double) a / b;


        System.out.printf("Final result by calculator: %.10f\n", calculatorResult);
        System.out.println("Final result by expansion: " + result);        
    }
}