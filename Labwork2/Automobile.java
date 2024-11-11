public class Automobile {
    public double fuel;
    public double speed;
    public String license;
    public void init(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }
    public void accelerate(double v) {
        if (fuel > 0) {
        speed += v;
        }
        
    }
    public void decelerate(double v) {
        if (fuel <= 0) {
            speed -= v;
        }
    }
    public void  showSpeed() {
        System.err.println(this.speed);
    }
}