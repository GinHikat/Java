public class AirConditioner extends CoolingDevice {
    int power;
    String brand;
    boolean inverter;
    @Override 
    public void cool() {
        System.out.println("The air conditioner " + brand + " is cooling down");
    }
    public AirConditioner(int power, String brand) {
        this.power = power;
        this.brand = brand;
    }
    public void display() {
        System.out.println("The fan of brand " + brand  + " has power " + power);
    }
    public void dry() {
        if (inverter == true) {
        System.out.println("Changing to dry mode");
        } else {
            System.out.println("Please turn on first");
        }
    }
    public void fanOnly() {
        if (inverter == true) {
        System.out.println("Changing to fan");
        } else {
            System.out.println("Please turn on first");
        }
    }
    public void turnOn() {
        inverter = true;
    }
    public void turnOff() {
        inverter = false;
    }
}