

public class AutomobileTest {
    public static void main(String[] args) {
    Automobile mobile1 = new Automobile();    
    mobile1.init(4.5,34,"29JAD");
    mobile1.accelerate(4);
    mobile1.decelerate(5);
    mobile1.showSpeed();
    }
}