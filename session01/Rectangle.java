public class Rectangle extends Shape {
    private double width;
    private double lenght;
    private double area;

    public Rectangle (String color, double width, double lenght) {
        super(color);
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double area() {
        this.area = width * lenght;
        return area;
    }

    

    public double getarea() {
        return area;
    }
}