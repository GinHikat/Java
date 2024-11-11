import java.util.ArrayList;
import java.util.Scanner;
public class ClassEmployee {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> list_name = new ArrayList<>();
    ArrayList<Integer> list_id = new ArrayList<>();
    ArrayList<String> list_department = new ArrayList<>();
    ArrayList<Integer> list_salary = new ArrayList<>();
    ArrayList<Integer> list_extrapay = new ArrayList<>();
    int array_finder = 0;
    
    public void getID() {
        System.out.println("Please enter ID: ");
        int ID = Integer.valueOf(scan.nextLine());
        list_id.add(ID);
    }
    public void getname() {
        System.out.println("Please enter your name: ");
        String name = String.valueOf(scan.nextLine());
        list_name.add(name);
    }
    public void getdepartment() {
        System.out.println("Please enter your department: ");
        String department = String.valueOf(scan.nextLine());
        list_department.add(department);
    }
    public void getsalary() {
        System.out.println("Please enter your salary: ");
        int salary = Integer.valueOf(scan.nextLine());
        list_salary.add(salary);
    }
    public void get_extra_salary() {
        System.out.println("Please enter your extra salary: ");
        int extra_salary = Integer.valueOf(scan.nextLine());
        list_extrapay.add(extra_salary);
    }
    public void checkInfo() {
        System.out.println("Please input the ID you want to get: ");
        int ID_check = Integer.valueOf(scan.nextLine());
        for (int i = 0; i < list_id.size(); i++) {
            if(list_id.get(i) == ID_check) array_finder = i;
        }
        System.out.println("The information for ID: " + ID_check);
        System.out.println("ID: " + list_id.get(array_finder));
        System.out.println("Full Name: " + list_name.get(array_finder));
        System.out.println("Department: " + list_department.get(array_finder));
        System.out.println("Salary: " + list_salary.get(array_finder));
        System.out.println("Extra salary: " + list_extrapay.get(array_finder));
    }
}