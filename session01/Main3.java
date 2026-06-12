public class Main3 {
    public static void main(String[] args) {
        AbstractLogger a = new ConsoleLogger("CONSOLE");
        a.log("Sensor online");
        a.log(null);
        a.log("Temperatur: 19.3");
        System.out.println(a.getName() + ": " + a.getCount() + " Nachrichten");
        //AbstractLogger b = new AbstractLogger("X");

        AbstractLogger b = new TimestampLogger("TIMER");
        b.log("Sensor online");
        b.log(null);
        System.out.println(b.getName() + ": " + b.getCount() + " Nachrichten");

        AbstractLogger x = new ConsoleLogger("TEST");
        AbstractLogger y = new TimestampLogger("TIMER");
        x.log("Hallo"); // x ist AbstractLogger — welche log() wird aufgerufen?
        y.log("Hallo"); // y ist AbstractLogger — welche log() wird aufgerufen?


        Shape c = new Circle("Blau", 2.0);
        Shape r = new Rectangle("Rot", 4.0, 3.0);
        Shape t = new Triangle("Grün", 3.0, 3.0, 4.0);
        System.out.println(c.describe());
        System.out.println(r.describe());
        System.out.println(t.describe());
    }
}