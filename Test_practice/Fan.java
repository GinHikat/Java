public class Fan extends CoolingDevice {
    final int speed;
        public Fan(int speed, int power, String brand) {
            this.speed = speed;
            this.power = power;
            this.brand = brand;
        }
        public void display() {
            System.out.println("The fan speed: " + this.speed + " power = " + this.power + " brand = " + this.brand);
        }
        public void swing() {
            System.out.println("The fan is swinging with speed " + speed);
        }
        @Override
        public void cool() {
            System.out.println("The fan is cooling down");
        }
    }
