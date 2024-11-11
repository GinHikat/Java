public class Object {
    public abstract class Shape {
        public double calArea() {
            return 0;
        }
        public double calVolume() {
           return 0;
        }
        public abstract void getName ();

    }
    public class Point extends Shape {
        public double x;
        public double y;
        @Override
        public void getName() {
            System.out.println("Point");
        }
        public Point(double x,double y){
            this.x = x;
            this.y = y;
        }
        public void setxy(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getx() {
            return this.x;
        }
        public double gety() {
            return this.y;
        }
    }
    public class Circle extends Point {
        public double r;
        public Circle (double x, double y, double r) {
            super(x, y);
            this.r = r;
        }
        @Override
        public void getName() {
            System.out.println("Circle");
        }
        @Override
        public double calArea() {
            return Math.PI * Math.PI * r;
        }
        @Override 
        public double calVolume() {
            return 0;
        }
    
    }
    public class Cylinder extends Circle {
        public double h;
        public Cylinder (double x, double y, double r, double h) {
            super(x, y, r);
            this.h = h;
        }
        @Override
        public void getName() {
            System.out.println("Cylinder");
        }
        @Override 
        public double calArea() {
            return 2*Math.PI*r*h + 2*Math.PI*r*r;
        }
        @Override
        public double calVolume() {
            return Math.PI*r*r*h;
        }

    }
}