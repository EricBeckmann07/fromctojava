public abstract class Shape {
    private String color;

    public Shape (String color) {
        this.color = color;
    }

    public abstract double area();

    public String describe() {
        String ausgabe = "Farbe: " + color + "| Fläche: " + area() + " cm^2";
        return ausgabe;
    }
}