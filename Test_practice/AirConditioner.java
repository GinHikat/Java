public class AirConditioner extends CoolingDevice {
    public AirConditioner(int power, String brand) {
            this.power = power;
            this.brand = brand;
        }
        public void display() {
            System.out.println("power: " + this.power + " brand " + this.brand);
        }
        @Override
        public void cool() {
            System.out.println("The fan is cooling down");
        }
}