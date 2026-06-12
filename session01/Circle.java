public class Circle extends Shape {
    private double radius;
    private double area;

    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        this.area = Math.PI * radius*radius;
        return area;
    }

    

    public double getarea() {
        return area;
    }
}