public class Fan extends CoolingDevice
{
    private final int speed;

    public Fan(int power, String brand, int speed)
    {
        super(power, brand);
        this.speed = speed;
    }

    public void swing()
    {
        System.out.println("Fan is swinging");
    }

    @Override
    public void cool()
    {
        System.out.println("Fan cooling at speed: "+ speed);
    }

    @Override
    public String display()
    {
        return "Fan - " + super.display() +", Speed: "+speed;
    } 
}