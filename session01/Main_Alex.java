
public class Main {
    public static void main(String[] args) {
        SensorReading d1 = new SensorReading(1, "S1", 19.3, 64.2);
        SensorReading d2 = new SensorReading(2, "S1", 25, 50.4);
        SensorReading d3 = new SensorReading(3, "S1", 30.3, 32.3);
        
        InMemoryStore storage = new InMemoryStore();
        storage.handle(d1);
        storage.handle(d2);
        storage.handle(d3);
        storage.close();
    }
}