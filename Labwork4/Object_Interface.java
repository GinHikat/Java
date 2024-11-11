public class Object_Interface {
    interface Shape {
        double calArea();
        double calVolume();
        String getName();
    }
    class Point implements Shape {

        protected double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y=y;
        }
        @Override 
        public String getName() {
            return "Point";
        }
        @Override 
        public double calArea() {
            return 0;
        }
        @Override 
        public double calVolume() {
            return 0;
        }
    }
    class Circle extends Point {
        protected double r;
        public Circle (double x, double y, double r) {
            super(x, y);
            this.r = r;
        }
        @Override
        public String getName() {
            return "Circle";
        }
        @Override 
        public double calArea() {
            return Math.PI*r*r;
        }
        @Override 
        public double calVolume() {
            return 0;
        }
    }
    class Cylinder extends Circle {
        protected double h;
        public Cylinder (double x, double y, double r, double h) {
            super(x,y,r);
            this.h = h;
        }
        @Override
        public String getName() {
            return "Cylinder";

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

