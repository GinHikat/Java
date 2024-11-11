public class Fan extends CoolingDevice {
    int speed;
    int power;
    String brand;
    public Fan(int speed, int power, String brand) {
        this.speed = speed;
        this.power = power;
        this.brand = brand;
    }
    @Override
    public void cool() {
        System.out.println("The fan " + brand + " is cooling down");
    }
    public void display() {
        System.out.println("The fan of brand " + brand + " has speed " + speed + " and power " + power);
    }
    public void swing() {
        System.out.println("The fan is swinging");
    }
}