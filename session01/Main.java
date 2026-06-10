import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void processAll(List<SensorReading2> readings, SensorDataHandler handler) throws Exception {
        if (readings == null || handler == null) {
            return;
        }
        for (SensorReading2 r : readings) {
            handler.handle(r);
        }
        handler.close();
        
    }

    public static void main(String[] args) throws Exception {
        List<SensorReading2> data = new ArrayList<>();
        data.add(new SensorReading2(1, "S1", 19.3, 64.2f));
        data.add(new SensorReading2(2, "S1", 25, 50.4f));
        data.add(new SensorReading2(3, "S1", 30.3, 32.3f));

        processAll(data, new CSVReader("text.csv"));

        new CSVReader("text.csv");
        new ConsolePrinter("Hallo");

        MultiHandler multi = new MultiHandler();
        multi.add(new CSVReader("text.csv"));
        multi.add(new ConsolePrinter("Hallo"));
        
        processAll(data, multi);

    }
}