import java.util.ArrayList; 
import java.util.List; 
import java.util.Iterator; 

public class Hallo {
    public static void main(String[] args) {

        List<Describable> things = new ArrayList<>(); 

        things.add(new SensorReading2(1, "S1", 19.3, 64.2f)); 
        things.add(new Station("Nord", "Freiburg")); 
        things.add(new SensorReading2(2, "S2", 22.1, 61.0f)); 
        things.add(new Station("Süd", "Basel"));

        for (Describable d : things) {
            System.out.println(d.describe());
        }
    }
}