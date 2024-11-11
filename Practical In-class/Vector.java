public class Vector {
    private int x;
    private int y;
    public void setx(int x) {
        this.x = x;
    }
    public int getx() {
        return x;
    }
    public void sety(int y) {
        this.y = y;
    }
    public int gety() {
        return y;
    }
    public void add() {
        System.err.println("x + y = " + (x+y));
    }
    public void subtract() {
        System.err.println("x - y = " + (x-y));
    }
    public void multiply() {
        System.err.println("x * y = " + (x*y));
    }
}