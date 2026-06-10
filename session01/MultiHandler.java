import java.util.List;
import java.util.ArrayList;

public class MultiHandler implements SensorDataHandler {
    private List<SensorDataHandler> handlers = new ArrayList<>();

    public void add(SensorDataHandler handler) {
        handlers.add(handler);
    }

    @Override
    public void handle(SensorReading2 reading) {
        for (SensorDataHandler h : handlers) {
            h.handle(reading);
        }
    }

    @Override
    public void close() {
        for (SensorDataHandler h : handlers) {
            h.close();
        }
    }
}