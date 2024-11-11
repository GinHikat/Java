public class ShapeTestDrive {
    public static void main(String[] args) {
        Object.Point point = new Object().new Point(1, 2);
        point.getName();
        Object.Circle circle = new Object().new Circle(1, 2, 4);
        circle.getName();
        System.out.printf("Area of the circle: %.5f\n",circle.calArea());
        Object.Cylinder cylinder = new Object().new Cylinder(1,2,3,4);
        cylinder.getName();
        System.out.printf("Area of the cylinder: %.5f\n", cylinder.calArea());
        System.out.printf("Volume of the cylinder: %.5f\n", cylinder.calVolume());

    }
}