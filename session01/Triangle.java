public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle (String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s =  (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    
}