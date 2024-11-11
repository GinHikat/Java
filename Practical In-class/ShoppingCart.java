import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void cart() {
        while (true) {
            String product = String.valueOf(scan.nextLine());
            if (product.equals("")) {
                break;
            } else {
                list.add(product);
            }
        }
    } 
    public void addToCart() {
        System.out.println("Do you want to add something?");
        while (true) {
            String product = String.valueOf(scan.nextLine());
            if (product.equals("")) {
                break;
            } else {
                list.add(product);
            }
        }
        System.out.println("Your cart after add: ");
        for (int i = 0; i<list.size(); i++) {
            System.out.printf(list.get(i) + " ");
        }
        System.out.println("");

    }
    public void removeFromCart() {
        System.out.println("Do you want to remove anything?");
        for (int i = 0; i< list.size(); i++) {
            String remove = String.valueOf(scan.nextLine());
            if (list.get(i).equals( remove)) {
                list.remove(remove);
            }
            if (remove.equals("")) {
                break;
            }
        }
        System.out.println("Your cart after remove: ");
        for (int i = 0; i<list.size(); i++) {
            System.out.printf(list.get(i) + " ");
        }
        System.out.println("");
    }
    public void checkOut() {
        System.out.println("Do you finish yet?");
        String answer = String.valueOf(scan.nextLine());
        while(true){
        if(answer.equals("yes")) {
            System.out.println("You are free to go\nYour order: "); 
        for (int i = 0; i<list.size(); i++) {
            System.out.printf(list.get(i) + " ");
            
        }
        System.out.println("");
        break;
        }
        else {
            addToCart();
            removeFromCart();
        }
    }
    }
    public void greet() {
        System.out.println("Welcome " + name);
    }
    public void inform() {
        System.err.println("Please input your products");
    }
    public void currentCart() {
        System.err.println("Your current cart: ");
        for (int i = 0; i<list.size(); i++) {
            System.out.printf(list.get(i) + " ");
            
        }
        System.out.println("");
    }
}