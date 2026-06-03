public class Main {
    public static void main(String[] args) {
        SensorReading2 r1 = new SensorReading2(1, "S1", 18.3, 30.5f);

        SensorDataHandler handler = new ConsolePrinter("Initiale Ausgabe");
        handler.handle(r1);
        handler.close();


        SensorReading2 d1 = new SensorReading2(1, "S1", 19.3, 64.2f);
        SensorReading2 d2 = new SensorReading2(2, "S1", 25, 50.4f);
        SensorReading2 d3 = new SensorReading2(3, "S1", 30.3, 32.3f);
        
        InMemoryStore storage = new InMemoryStore();
        storage.handle(d1);
        storage.handle(d2);
        storage.handle(d3);
        storage.close();

    }
}