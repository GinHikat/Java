import java.util.Scanner;
public class Employee_check {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            ClassEmployee employ = new ClassEmployee();
            employ.getID();
            employ.getname();
            employ.getdepartment();
            employ.getsalary();
            employ.get_extra_salary();
            System.out.println("Do you want to stop now?");
            System.out.println("1. Yes\n2. No");
            int answer = Integer.valueOf(scan.nextLine());
            if (answer ==1) break;
            employ.checkInfo();
        } 
        
    }
}